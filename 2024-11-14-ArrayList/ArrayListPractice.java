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

  public static void replaceEmpty(ArrayList<String> original){
    for(int i = 0; i< original.size(); i++){
      if(original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }
}
