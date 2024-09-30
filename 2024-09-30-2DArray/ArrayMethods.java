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
  public static void main(String[] args){

  }
}
