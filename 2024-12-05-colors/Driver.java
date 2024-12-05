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
  public static void main(String[] args){
      border(80,30,41);
  }
}
