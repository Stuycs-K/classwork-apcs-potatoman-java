public class MyArrays {
  public static String aryToString(int[] nums){
    String str = "[";
    for (int idx = 0; idx < nums.length; idx++){
      str += "nums[idx]";
      if (idx < nums.length - 1){
        str += ", ";
      }
    }
    return (str+"]");
  }
  public static void main (String[] args) {
    System.out.println("Testing returnCopy");
    int[] testArray = new int[]{1,2,3,4};
    System.out.println("expected value: "+ arrays.toString(testArray) + "returned value: "+ arrays.toString(returnCopy(testArray)));
    if (Array.equals(testArray, returnCopy(testArray))){
      System.out.println("contents equal");
    }
    if(testArray == returnCopy(testArray)){
      System.out.println("same array");
    }
    int[] testArray1 = new int[]{5,2,10,13};
    System.out.println("expected value: "+ arrays.toString(testArray1) + "returned value: "+ arrays.toString(returnCopy(testArray1)));
    if (Array.equals(testArray1, returnCopy(testArray1))){
      System.out.println("contents equal");
    }
    if(testArray1 == returnCopy(testArray1)){
      System.out.println("same array");
    }
    System.out.println("Testing concatArray");
    int[] Arraycat = new int[]{1,2,3,4,5,2,10,13};
    System.out.println("expected value: "+ arrays.toString(Arraycat) + "returned value: "+ arrays.toString(concatArray(testArray,testArray1)));
    if (Array.equals(Arraycat, concatArray(testArray,testArray1))){
      System.out.println("contents equal");
    }
    int[] Arraycat1 = new int[]{5,2,10,13,1,2,3,4};
    System.out.println("expected value: "+ arrays.toString(Arraycat1) + "returned value: "+ arrays.toString(concatArray(testArray1,testArray)));
    if (Array.equals(Arraycat, concatArray(testArray,testArray))){
      System.out.println("contents equal");
    }
  }



}
