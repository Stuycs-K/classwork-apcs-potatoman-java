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
  public static ArrayList<String> makeReversedList(ArrayList<String> original){
    ArrayList<String> reversed = new ArrayList<String>();
    for(int i = original.size()-1; i >= 0; i--){
      reversed.add(original.get(i));
    }
    return reversed;
  }
  public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b){
    ArrayList<String> mixed = new ArrayList<String>();
    int index = 0;
    while(index < Math.min(a.size(),b.size())){
      mixed.add(a.get(index));
      mixed.add(b.get(index));
      index++;
    }
    if (index == a.size()){
      while (index < b.size()){
        mixed.add(b.get(index));
        index++;
      }
    }
    else{
      while(index < a.size()){
        mixed.add(a.get(index));
        index++;
      }
    }
    return mixed;
  }
}
