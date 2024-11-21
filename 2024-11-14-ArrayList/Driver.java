import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    ArrayList<String> Short = new ArrayList<String>();
    ArrayList<String> Short2 = new ArrayList<String>();
    Short = ArrayListPractice.createRandomArray(20);
    Short2 = ArrayListPractice.createRandomArray(20);
    System.out.println(Short);
    System.out.println(Short2);
    System.out.println(ArrayListPractice.mixLists(Short,Short2));
    //ArrayListPractice.replaceEmpty(Short);
    //System.out.println(ArrayListPractice.makeReversedList(Short));
  }
}
