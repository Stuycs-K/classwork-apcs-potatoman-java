public class MyArrays {
  public static String aryToString(int[] nums){
    String str = "[";
    for (int idx = 0; idx < nums.length; idx++){
      str += nums[idx];
      if (idx < nums.length - 1){
        str += ", ";
      }
    }
    return (str+"]");
  }
  public static int[] returnCopy(int[]ary){
    int[] copy = new int[ary.length];
    for(int idx = 0; idx < ary.length; idx++){
      copy[idx] = ary[idx];
    }
    return copy;
  }
  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] concat = new int[ary1.length+ary2.length];
    int counter = 0;
    for(int idx = 0; idx < ary1.length; idx++){
      concat[counter]=ary1[idx];
      counter ++;
    }
    for(int idx = 0; idx < ary2.length; idx++){
      concat[counter]=ary2[idx];
      counter++;
    }
    return concat;
  }
  public static void main (String[] args) {
    System.out.println("Testing returnCopy");
    int[] testArray = new int[]{1,2,3,4};
    System.out.println("expected value: "+ aryToString(testArray) + "returned value: "+ aryToString(returnCopy(testArray)));
    if (aryToString(testArray).equals(aryToString(returnCopy(testArray)))){
      System.out.println("contents equal");
    }
    if(testArray == returnCopy(testArray)){
      System.out.println("same array");
    }
    int[] testArray1 = new int[]{5,2,10,13};
    System.out.println("expected value: "+ aryToString(testArray1) + "returned value: "+ aryToString(returnCopy(testArray1)));
    if (aryToString(testArray1).equals(aryToString(returnCopy(testArray1)))){
      System.out.println("contents equal");
    }
    if(testArray1 == returnCopy(testArray1)){
      System.out.println("same array");
    }
    System.out.println("Testing concatArray");
    int[] Arraycat = new int[]{1,2,3,4,5,2,10,13};
    System.out.println("expected value: "+ aryToString(Arraycat) + "returned value: "+ aryToString(concatArray(testArray,testArray1)));
    if (aryToString(Arraycat).equals(aryToString(concatArray(testArray,testArray1)))){
      System.out.println("contents equal");
    }
    int[] Arraycat1 = new int[]{5,2,10,13,1,2,3,4};
    System.out.println("expected value: "+ aryToString(Arraycat1) + "returned value: "+ aryToString(concatArray(testArray1,testArray)));
    if (aryToString(Arraycat1).equals(aryToString(concatArray(testArray1, testArray)))){
      System.out.println("contents equal");
    }
  }



}
