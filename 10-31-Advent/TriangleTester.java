import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TriangleTester {
  public static boolean validTriangle(int s1, int s2, int s3){
    return !(s1+s2 <= s3 || s1+s3 <= s2 || s2+s3 <= s1);
  }
  public static int countTrianglesA(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int side1, side2, side3, counter;
      counter = 0;
      while(input.hasNext()){
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();
        if(validTriangle(side1, side2, side3)){
          counter++;
        }
      }
      return counter;
    }catch(FileNotFoundException ex){
      System.out.println("File not found");
      return 0;
    }
  }
  public static int countTrianglesB(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int t1s1, t1s2, t1s3, t2s1, t2s2, t2s3, t3s1, t3s2, t3s3;
      int counter = 0;
      while(input.hasNextInt()){
        t1s1 = input.nextInt();
        t2s1 = input.nextInt();
        t3s1 = input.nextInt();
        t1s2 = input.nextInt();
        t2s2 = input.nextInt();
        t3s2 = input.nextInt();
        t1s3 = input.nextInt();
        t2s3 = input.nextInt();
        t3s3 = input.nextInt();
        if(validTriangle(t1s1, t1s2, t1s3)){
          counter++;
        }
        if(validTriangle(t2s1, t2s2, t2s3)){
          counter++;
        }
        if(validTriangle(t3s1, t3s2, t3s3)){
          counter++;
        }
      }
      return(counter);
    }catch(FileNotFoundException ex){
      System.out.println("File not found");
      return 0;
    }
  }
  public static void main(String[] args){
    System.out.println(countTrianglesB("inputTri.txt"));
  }
}
