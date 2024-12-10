import java.util.Scanner;
public class Game{
  public static void main (String[]args){
    Scanner userInput = new Scanner(System.in);
    Adventurer nerd = new CodeWarrior("Jake", 20, "DrRacket");
    System.out.println("Type your name:");
    Adventurer You = new Necromancer(userInput.nextLine(), 20);
    System.out.println("You are a Necromancer named "+You.getName()+".  Your opponent is a CodeWarrior named "+nerd.getName()+".");
    System.out.println("BEGIN");
    battlestats(You);
    battlestats(nerd);
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String input = userInput.nextLine();
    int enemyattackchoice;
    while(!input.equals("quit")){
      if(input.equals("a")){
        System.out.println(You.attack(nerd));
      }else if(input.equals("sp")){
        System.out.println(You.specialAttack(nerd));
      }else if(input.equals("su")){
        System.out.println(You.support());
      }else if(! input.equals("quit")){
        System.out.println("not a valid input.");
      }
      if((input.equals("a") || input.equals("sp") || input.equals("su")) && nerd.getHP()>0){
        enemyattackchoice = (int) (Math.random()*3);
        if (enemyattackchoice == 0){
          nerd.attack(You);
        }else if(enemyattackchoice == 1){
          nerd.specialAttack(You);
        }else if(enemyattackchoice == 2){
          nerd.support();
        }
      }
      battlestats(You);
      battlestats(nerd);
      if(You.getHP()<=0 || nerd.getHP()<=0) break;
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      input = userInput.nextLine();

    }
    if(You.getHP()<=0){
      System.out.println("YOU LOSE");
    }else if(nerd.getHP()<=0){
      System.out.println("YOU WIN");
    }
  }
  public static void battlestats(Adventurer P1){
    System.out.println(P1.getName()+", "+P1.getHP()+"/"+P1.getmaxHP()+" HP, "+P1.getSpecial()+"/"+P1.getSpecialMax()+" "+P1.getSpecialName());
  }
}
