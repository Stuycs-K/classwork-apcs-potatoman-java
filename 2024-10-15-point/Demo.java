public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double dist;
    dist = Math.sqrt(Math.pow((a.getX()-b.getX()),2)+Math.pow((a.getY()-b.getY()),2));
    return dist;
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p1);
    Point p5 = new Point(p2);
    Point p6 = new Point(0,0);
    Point p7 = new Point(4,0);
    Point p8 = new Point(2,Math.sqrt(12));
    System.out.println( p3);
    System.out.println( p4);
    System.out.println( p5);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println( distance(p1,p3));
    System.out.println( Point.distance(p1,p3));
    System.out.println( p1.distanceTo(p3));
    System.out.println( distance(p6,p7));
    System.out.println( distance(p6,p8));
    System.out.println( distance(p7,p8));
  }
}
