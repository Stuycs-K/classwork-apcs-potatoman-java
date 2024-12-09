import java.util.Random;
import java.util.ArrayList;
public class Necromancer extends Adventurer{
  private int souls = 0, maxSouls = 10, level = 0;
  public Necromancer(String name){
    super(name);
  }
  public Necromancer(String name, int hp){
    super(name, hp);
  }

  public String getSpecialName(){
    return("souls");
  }
  public int getSpecial(){
    return(souls);
  }
  public void setSpecial(int n){
    souls = n;
  }
  public int getSpecialMax(){
    return maxSouls;
  }
  public String attack(Adventurer other){
    Random seed = new Random();
    Random damage = new Random((long)seed.nextInt());
    int hit = (int) (damage.nextDouble()*(6));
    hit+=(5*level);
    other.applyDamage(hit);
    return("You cast Hell Gate on " + other.getName() + " and dealt " + hit + " damage by briefly dropping them into hell.  You grabbed "+ this.restoreSpecial(hit) +" loose souls before the gate closed");
  }
  public String support(Adventurer other){
    other.setHP(other.getHP()+5);
    return("you cast Bone Shield on " + other.getName()+ ". Bones wrap around them and block the next 5 damage taken.");
  }
  public String support(){
    this.setHP(this.getHP()+5);
    return("you cast Bone Shield on yourself. Bones wrap around you and block the next 5 damage taken.");
  }
  public String specialAttack(Adventurer other){
    if(souls >= 5){
      other.applyDamage((level+1)*10);
      souls -=3;
      return("you cast Soul Spasm.  You did "+(level+1)*10 + " damage by flinging some loose souls at them.  You managed to recapture 2 of them but the rest escaped.");
    }else if(souls > 0){
      return("you didn't have enough souls.  You decide to try anyway.  The souls consume a bit of your blood and explode in the enemy's face doing 5 damage to yourself and 15 damage to the opponent.");
      this.applyDamage(5);
      other.applyDamage(15);
    }else{
      return("you have no souls.  Wow, what a failure.  You weep in the corner solemly, dealing no damage. Fortunately, a soul takes pity on you and allows you to capture it");
      restoreSpecial(1);
    }
  }

}
