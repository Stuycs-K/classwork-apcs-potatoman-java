import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class day1{
  public static int findBlocks(String filename){
    try{
    File directions = new File(filename);
    Scanner input = new Scanner(directions);
    String temp;
    int direction = 90;
    int verticalblocks = 0;
    int horizontalblocks = 0;
    while(input.hasNext()){
      temp = input.next();
      temp = temp.substring(0, temp.length()-1);
      if(temp.charAt(0)=='R'){
        direction -= 90;
      }
      else{
        direction += 90;
      }
      if (direction < 0){
        direction += 360;
      }
      if (direction > 360){
        direction -= 360;
      }
      if (direction == 90){
        verticalblocks+=Integer.parseInt(temp.substring(1));
      }
      else if (direction == 270){
        verticalblocks-=Integer.parseInt(temp.substring(1));
      }
      else if (direction == 0){
        horizontalblocks+=Integer.parseInt(temp.substring(1));
      }
      else if (direction == 180){
        horizontalblocks-=Integer.parseInt(temp.substring(1));
      }
      System.out.println(temp + " order");
      System.out.println(direction + " facing");
      System.out.println(Integer.parseInt(temp.substring(1)) + " distance");
      System.out.println(verticalblocks + " vertical");
      System.out.println(horizontalblocks + " horizontal");
    }
    return horizontalblocks + verticalblocks;
  }catch(FileNotFoundException ex){
    System.out.println("File not found");
    return 0;
  }
  }
  public static void main(String[] args){
    System.out.println(findBlocks("day1input.txt"));
  }
}
