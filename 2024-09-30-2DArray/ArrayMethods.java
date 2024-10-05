//Nathan Lam, Jerry Jiang, nathanl74@nycstudents.net, jerryj36@nycstudents.net
public class ArrayMethods{
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
  public static int arr2DSum(int[][] nums){
    int sum = 0;
    for (int idx = 0; idx < nums.length; idx++){
      for(int idx1 = 0; idx1 < nums[idx].length; idx1++){
        sum += nums[idx][idx1];
      }
    }
    return sum;
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
  public static void replaceNegative(int[][] vals){
      for (int i = 0; i < vals.length; i++){
        for (int j = 0; j < vals[i],length; j++){
          if (vals[i][j] < 0){
            if (i == j){
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
  public static void main(String[] args){
    //testing first function
    int[][] testArr = new int[][] {{1,2,3},{0,0,0},{1,1,1,1,1}};
    System.out.println("Expected = " + "[[1, 2, 3], [0, 0, 0], [1, 1, 1, 1, 1]]" + " Result = " +arrToString(testArr));
    int[][] testArr1 = new int[][] {{4,32,5,2},{1,6},{3,3,2}};
    System.out.println("Expected = " + "[[4, 32, 5, 2], [1, 6], [3, 3, 2]]" + " Result = " +arrToString(testArr1));
    //testing function 2
    int[][] testArr2 = new int[][] {{1,2,3},{4,5},{6,7,8,9}};
    System.out.println("Expected = " + 45 + " Result = " +arr2DSum(testArr2));
    int[][] testArr3 = new int[][] {{4,4,4,4},{4},{4,4,4,4,4}};
    System.out.println("Expected = " + 40 + " Result = " +arr2DSum(testArr3));
    //function 3
    int[][] testArr4 = new int[][] {{1,2,3},{4,5,6}};
    System.out.println("Expected = " + "[[1, 4], [2, 5], [3, 6]]" + " Result = " +arrToString(swapRC(testArr4)));
    int[][] testArr5 = new int[][] {{1,2},{3,4},{5,6},{7,8}};
    System.out.println("Expected = " + "[[1, 3, 5, 7], [2, 4, 6, 8]]" + " Result = " +arrToString(swapRC(testArr5)));
    //testing replaceNegative
    int[][] testArr6 = new int[][] {{-1,3,-1},{4,-2,-1},{8,3,6}};
    replaceNegative(testArr6);
    System.out.println("Expected = " + "[[1, 3, 0], [4, 1, 0], [8, 3, 6]]" + " Result = " +arrToString(testArr6));
    int[][] testArr7 = new int[][] {{-5,2,1},{1},{},{3,-1,5,-5}};
    replaceNegative(testArr7);
    System.out.println("Expected = " + "[[1, 2, 1], [1], [], [3, 0, 5, 1]]" + " Result = " +arrToString(testArr7));
    //testing copy w 2d
    int[][] testArr8 = new int[][] {{1,2,3},{2},{5,1,2,3,4}};
    System.out.println("Expected = " + "[[1, 2, 3], [2], [5, 1, 2, 3, 4]]" + " Result = " +arrToString(copy(testArr8)));
    int[][] testArr9 = new int[][] {{2},{},{1,2,5},{10,5}};
    System.out.println("Expected = " + "[[2], [], [1, 2, 5], [10, 5]]" + " Result = " +arrToString(copy(testArr9)));
  }

}
