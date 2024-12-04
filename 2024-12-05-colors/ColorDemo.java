public class ColorDemo{
  public static void main(String[] args){
    int r=256, g=256, b=256;
    for(int i = 0; i<Integer.parseInt(args[0])*100; i++){
      System.out.print(rgbackground(r,g,b));
      System.out.print(rgbopposite(r,g,b));
      System.out.print("\u25A1");
      r-=16;
      g-=16;
      b-=16;
      if(r<=0){
        r+=256;
      }
      if(g<=0){
        g+=256;
      }
      if(b<=0){
        b+=256;
      }  
    }



    System.out.print("\u001b[0m");
  }
  public static String rgbackground(int r, int g, int b){
    return("\u001b[48;2;"+r+";"+g+";"+b+" m.");
  }
  public static String rgbopposite(int r, int g, int b){
    return("\u001b[38;2;"+256-r+";"+256-g+";"+256-b+" m.");
  }
}
