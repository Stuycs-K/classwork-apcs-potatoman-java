import java.util.Arrays;
public class ArrayDemo {
  public static void main(String[]args){
    int[][] test1 = {{0,1,4},{0,14,0},{},{1,5,2}};
    int[][] test2 = {{},{}};
    int[][] test3 = {{1,4,4},{9,1,5},{1,1,1,1,1,1,1}}
    //testing arrToString
    System.out.println("Expected = "+Arrays.toString(test1)+" Result = " +arrToString(test1));
    System.out.println("Expected = "+Arrays.toString(test2)+" Result = " +arrToString(test2));
    System.out.println("Expected = "+Arrays.toString(test3)+" Result = " +arrToString(test3));
    //testing countZeroes2D
    System.out.println("Expected = "+3+" Result = "+countZeroes2D(test1));
    System.out.println("Expected = "+0+" Result = "+countZeroes2D(test2));
    System.out.println("Expected = "+0+" Result = "+countZeroes2D(test3));
    //testing arr2DSum
    System.out.println("Expected = "+27+" Result = "+arr2DSum(test1));
    System.out.println("Expected = "+0+" Result = "+ arr2DSum(test2));
    System.out.println("Expected = "+31+" Result = "+ arr2DSum(test3));
    //testing replaceNegative
    int[][] test4 = new int[][] {{-1,3,-1},{4,-2,-1},{8,3,6}};
    replaceNegative(testArr4);
    System.out.println("Expected = " + "[[1, 3, 0], [4, 1, 0], [8, 3, 6]]" + " Result = " +Arrays.toString(test4));
    int[][] test5 = new int[][] {{-5,2,1},{1},{},{3,-1,5,-5}};
    replaceNegative(test5);
    System.out.println("Expected = " + "[[1, 2, 1], [1], [], [3, 0, 5, 1]]" + " Result = " +Arrays.toString(test5));
    //testing copy
    System.out.println("Expected = " + "[[0, 1, 4], [0, 14, 0], [], [1, 5, 2]]" + " Result = " +arrToString(copy(test1)));
    System.out.println("Expected = " + "[[], []]" + " Result = " +Arrays.toString(copy(test2)));
    System.out.println("Expected = " + "[[1, 4, 4], [9, 1, 5], [1, 1, 1, 1, 1, 1, 1]]" + " Result = " +Arrays.toString(copy(test3)));
    //testing swapRC
    int[][] test6 = new int[][] {{1,2,3},{4,5,6}};
    System.out.println("Expected = [[1, 4], [2, 5], [3, 6]] Result = " +Arrays.toString(swapRC(testArr4)));
    int[][] test7 = new int[][] {{1,2},{3,4},{5,6},{7,8}};
    System.out.println("Expected = [[1, 3, 5, 7], [2, 4, 6, 8]] Result = " +Arrays.toString(swapRC(testArr5)));
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
  public static int[] copyHelper(int[] nums){
    int[] copy = new int[nums.length];
    for (int idx = 0; idx < nums.length; idx ++){
      copy[idx] =  nums[idx];
    }
    return copy;
  }
  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for (int idx = 0; idx < nums.length; idx++){
      result[idx] = copyHelper(nums[idx]);
    }
    return result;
  }
  public static int[][] swapRC(int[][] nums){
    int[][] newArr = new int[nums[0].length][nums.length];
    for (int idx = 0; idx < nums.length; idx++){
      for(int idx1 = 0; idx1 < nums[idx].length; idx1++){
        newArr[idx1][idx] = nums[idx][idx1];
      }
    }
    return (newArr);
  }
  public static String htmlTable(int[][] nums){
    String table = "<table>";
    String row ="";
    for (int idx = 0; idx < nums.length; idx++){
      row = "<tr>";
      for (int idx1 = 0; idx1 < nums[idx].length; idx1++){
        row += "<td>"+nums[idx][idx1]+"</td>";
      }
      row+="</tr>";
      table+=row;
    }
    return(table+"</table>");
  }
}
