public class Point{
  private double x,y;

  public String toString(){
    return "("+x+", "+y+")";
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    x = other.getX();
    y = other.getY();
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  /*
  Write this method FOURTH, go to the main and do that one first.
  */
  public double distanceTo(Point other){
    double dist;
    dist = Math.sqrt(Math.pow((x-other.getX()),2)+Math.pow((y-other.getY()),2));
    return dist;
  }

  /*
  Write this method last. Re-use (NOT COPY/PASTE) prior work and
  do not write redundant code.
  */
  public static double distance(Point a, Point b){
    double dist;
    dist = Math.sqrt(Math.pow((a.getX()-b.getX()),2)+Math.pow((a.getY()-b.getY()),2));
    return dist;
  }


}
