import java.util.Scanner;
public class Game{
  public static void main (String[]args){
    Scanner userInput = new Scanner(System.in);
    Adventurer nerd = new CodeWarrior("josh", 20, "DrRacket");
    System.out.println("What is your name?");
    Adventurer You = new Necromancer(Scanner.nextLine(), 20);
    System.out.println("You are a Necromancer named "+You.getName()+")
  }
}
