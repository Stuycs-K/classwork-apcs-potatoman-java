public class Driver{
  public static void main(String[] args){
      Adventurer P1 = new Necromancer("billy");
      Adventurer P2 = new Necromancer("punching bag", 100);
      System.out.println(P1.getSpecial()+ " should be 0");
      System.out.println(P1.restoreSpecial(5)+ " should be 5");
      System.out.println(P1.getSpecial()+ " should be 5");
      System.out.println(P2.getHP()+ " should be 100");
      System.out.println(P1.attack(P2));
      System.out.println(P2.getHP()+" should be less");
      System.out.println(P1.support(P2));
      System.out.println(P2.getHP());
      System.out.println(P1.getHP());
      System.out.println(P1.support());
      System.out.println(P1.getHP());
      System.out.println(P2.getHP());
      System.out.println(P1.specialAttack(P2));
      System.out.println(P2.getHP());
      System.out.println(P1.getSpecial());
  }
}
