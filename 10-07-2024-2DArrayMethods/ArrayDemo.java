import java.util.Arrays;
public class ArrayDemo {
  public static void main(String[]args){
    int[][] test1 = {{0,1,4},{0,14,0},{},{1,5,2}};
    int[][] test2 = {{},{}};
    int[][] test3 = {{1,4,4},{9,1,5},{1,1,1,1,1,1,1}}
    //testing countZeroes2D
    System.out.println("Expected = "+3+" Result = "+countZeroes2D(test1));
    System.out.println("Expected = "+0+" Result = "+countZeroes2D(test2));
    System.out.println("Expected = "+0+" Result = "+countZeroes2D(test3));
    //testing arr2DSum
    System.out.println("Expected = "+27+" Result = "+arr2DSum(test1));
    System.out.println("Expected = "+0+" Result = "+ arr2DSum(test2));
    System.out.println("Expected = "+31+" Result = "+ arr2DSum(test3));
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
  public static int arr2DSum (int[][] nums){
    int sum = 0;
    for (int idx = 0; idx < nums.length; idx++){
      for (int idx1 = 0; idx1 < nums[idx].length; idx1++){
        sum += nums[idx][idx1];
      }
    }
    return sum;
  }
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int j = 0; j < vals[i],length; j++){
        if (vals[i][j] < 0){            if (i == j){
              vals[i][j] = 1;
          }
          else{
            vals[i][j] =0;
          }
        }
      }  
    }
  }

}
