import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
  public static void main(String[] args) {
    try {
      File file = new File("inputTri.txt");
      Scanner input = new Scanner(file);
      boolean skip = false;
      while(input.hasNextLine()){
        String thisline = input.nextLine();
        if(thisline.contains("{")){
          System.out.println(thisline);
        }
      }
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
  }
}
