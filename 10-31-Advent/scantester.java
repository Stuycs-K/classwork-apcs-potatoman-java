import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class scantester{
  public static void bywords(Scanner sc){
    while(sc.hasNext()){
      System.out.println(sc.next());
    }
  }
  public static double scansum(Scanner sc){
    double sum = 0;
    while(sc.hasNextDouble()){
      sum+=sc.nextDouble();
    }
    return sum;
  }
  public static void main (String[] args){
    /*
    Scanner sc1 = new Scanner("This is a bunch of words");
    Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
    System.out.println(scansum(sc2));
    bywords(sc1);
    */
  }
}
