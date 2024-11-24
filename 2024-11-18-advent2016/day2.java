import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class day2{
  public static boolean validymove(int x, int y, int change){
    boolean valid = true;
    if(change < 0){
    }
    else{

    }
  }
  public static boolean validxmove(int x, int y, int change){

  }
  public static void getCode(String filename){
    try{
    File instructions = new File(filename);
    Scanner input = new Scanner(instructions);
    int[][] keypad = {{1},{2,3,4},{5,6,7,8,9},{};
    int x=1,y=1;
    while(input.hasNextLine()){
      String lineinstruction = input.nextLine();
      for(int i = 0; i<lineinstruction.length(); i++){
        if(lineinstruction.charAt(i)=='U'){
          if(y!=0){
            y-=1;
          }
        }
        if(lineinstruction.charAt(i)=='D'){
          if(y!=2){
            y+=1;
          }
        }
        if(lineinstruction.charAt(i)=='L'){
          if(x!=0){
            x-=1;
          }
        }
        if(lineinstruction.charAt(i)=='R'){
          if(x!=2){
            x+=1;
          }
        }
      }
      System.out.println(keypad[y][x]);
    }
    }catch(FileNotFoundException ex){
      System.out.println("file not found");
    }
  }
  public static void main(String[] args){
    getCode("day2input.txt");
  }
}
