//Returning Object
public class Program3_ro {
    public static void main(String[] args) {
       Point p = createPoint(10, 20);
       System.out.println("Point : " + p.x + "," + p.y);
    }
    public static Point createPoint(int x, int y) {
       return new Point(x, y);
    }
 }
 
 class Point {
    int x;
    int y;
    public Point(int x, int y) {
       this.x = x;
       this.y = y;
    }
 }