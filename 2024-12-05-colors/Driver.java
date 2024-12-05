public class Driver{
  public static void border(int width, int height, int colorcode){
    Text.color(colorcode);
    for(int i = 0; i<width; i++){
      System.out.print(" ");
    }
    System.out.println(Text.RESET+"");
    for(int i = 0; i<height-2; i++){
      Text.color(colorcode);
      System.out.print(" ");
      System.out.print(Text.RESET);
      for(int j = 0; j<width-2; j++){
        System.out.print(" ");
      }
      Text.color(colorcode);
      System.out.print(" ");
      System.out.println(Text.RESET);
    }
    Text.color(colorcode);
    for(int i = 0; i<width; i++){
      System.out.print(" ");
    }
    System.out.print(Text.RESET);
    System.out.println("");
  }
  public static int randomint(){
    return((int)(Math.random()*99)+1);
  }
  public static void changeRightColor(int number){
    if (number > 75){
      Text.color(Text.GREEN, Text.BRIGHT);
    }
    if(number < 25){
      Text.color(Text.RED, Text.BRIGHT);
    }
  }
  public static void main(String[] args){
    System.out.print(Text.HIDE_CURSOR);
    System.out.print("\u001b[H");
    border(80,30,Text.background(Text.RED));
    int[] randarray = new int[3];
    for(int i = 0; i<3; i++){
      randarray[i]=randomint();
    }
    for(int i = 0; i<randarray.length; i++){
      Text.go(2,20+20*i);
      changeRightColor(randarray[i]);
      System.out.print(randarray[i]);
      System.out.print(Text.RESET);
    }
    Text.go(3,2);
    System.out.print(Text.RESET);
    Text.color(Text.background(Text.RED));
    for(int i = 0; i<78; i++){
      System.out.print(" ");
    }
    System.out.print(Text.RESET);
    Text.go(31,1);
  }
}
