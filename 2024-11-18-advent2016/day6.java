import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class day6{
  public static String unscramble(String filename){
    try{
      File message = new File(filename);
      Scanner input = new Scanner(message);
      ArrayList<char[]> characters = new ArrayList<char[]>();
      int counter = 0;
      while(input.hasNextLine()){
        String line = input.nextLine();
        char[] temp = new char[line.length()];
        for(int i = 0; i<line.length(); i++){
          temp[i] = line.charAt(i);
        }
        characters.add(temp);
        counter++;
      }
      String decoded = "";
      for(int i = 0; i < characters.get(1).length; i++){
        int leastletters = 10000000;
        int itercounter = 0;
        char leastfrequent = 'A';
        for(String alphabet = "abcdefghijklmnopqrstuvwxyz"; alphabet.length() > 0; alphabet = alphabet.substring(1)){
          itercounter=0;
          for(int j = 0; j < characters.size(); j++){
            if(characters.get(j)[i] == alphabet.charAt(0)){
              itercounter ++;
            }
          }
          if(itercounter<leastletters){
            leastletters=itercounter;
            leastfrequent = alphabet.charAt(0);
          }
        }
        decoded+=leastfrequent;
      }
      return decoded;
    }catch(FileNotFoundException ex){
      System.out.println("File not Found!");
    }
    return null;
  }
  public static void main(String[] args){
    System.out.println(unscramble("day6input.txt"));
  }
}
