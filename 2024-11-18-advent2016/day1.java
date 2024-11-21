
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class day1{
  public static void findBlocks(String filename){
    try{
    File directions = new File(filename);
    Scanner input = new Scanner(directions);
    String temp;
    int direction = 90;
    int x = 0, y = 0;
    int displacement;
    int[] beentox = new int[100];
    int[] beentoy = new int[100];
    int counter = 0;
    while(input.hasNext()){
      temp = input.next();
      temp = temp.substring(0,temp.length()-1);
      if (temp.charAt(0) == 'R'){
        direction-=90;
      }
      else{
        direction+=90;
      }
      if(direction >= 360){
        direction-=360;
      }
      else if(direction < 0){
        direction+=360;
      }
      displacement = Integer.parseInt(temp.substring(1));
      if (direction == 180 || direction == 270){
        displacement *= -1;
      }
      if(direction == 0 || direction == 180){
        x+=displacement;
      }
      else{
        y+=displacement;
      }
      beentox[counter] = x;
      beentoy[counter] = y;
      for(int i = 0; i < counter; i++){
        if (beentox[i]==x && beentoy[i]==y){
          System.out.println(x+","+y);
        }
      }
    }
  }catch(FileNotFoundException ex){
    System.out.println("File not found");
  }
  }
  public static void main(String[] args){
    findBlocks("day1input.txt");
  }
}
