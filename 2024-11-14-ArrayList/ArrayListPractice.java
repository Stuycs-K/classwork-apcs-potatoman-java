import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> randomList = new ArrayList<String>();
    int randomInt;
    while(size > 0){
      randomInt= (int)(Math.random()*11);
      if(randomInt == 0){
        randomList.add("");
      }
      else{
        randomList.add(randomInt+"");
      }
      size--;
    }
    return randomList;
  }
}
