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
    return("You cast Bone Shards on " + other.getName() + " and dealt " + hit + " damage.");
  }
  public String support(Adventurer other){
    other.setHP(other.getHP()+5);
    return("you cast Bone Shield on " + other.getName()+ ". You blocked the next 5 damage to them.");
  }
  public String support(){
    this.setHP(this.getHP()+5);
    return("you cast Bone Shield on yourself. You blocked the next 5 damage taken.");
  }
  public String specialAttack(Adventurer other){
    if(souls >= 5){
      other.applyDamage((level+1)*10);
      souls -=5;
      return("you cast Wailing Souls.  You did "+(level+1)*10 + " damage.");
    }else{
      return("you didn't have enough souls. Casting failed.");
    }
  }

}
