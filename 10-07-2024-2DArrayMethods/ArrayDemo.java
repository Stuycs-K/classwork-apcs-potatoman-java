import java.util.Arrays;
public class ArrayDemo {
  public static void main(String[]args){
    //testing countZeroes2D
    int[][] test1 = {{0,1,4},{0,14,0},{},{1,5,2}};
    System.out.println("Expected = "+3+" Result = "+countZeroes2D(test1));
    int[][] test2 = {{},{}};
    System.out.println("Expected = "+0+" Result = "+countZeroes2D(test2));
    //testing
  }
  public static String arrToString(int[] nums){
    String str = "[";
    for (int idx = 0; idx < nums.length; idx++){
      str += nums[idx];
      if (idx < nums.length - 1){
        str += ", ";
      }
    }
    return (str+"]");
  }
  public static String arrToString(int[][] nums){
    String str = "[";
    for (int idx = 0; idx < nums.length; idx++){
      str+=arrToString(nums[idx]);
      if (idx < nums.length - 1){
        str += ", ";
      }
    }
    return (str + "]");
  }
  public static int countZeros2D(int[][] nums){
    int counter = 0;
    for (int idx = 0; idx < nums.length; idx++){
      for(int idx1 = 0; idx1 < nums[idx].length; idx1++){
        if (nums[idx][idx1] == 0){
          counter ++;
        }
      }
    }
    return counter;
  }

}
