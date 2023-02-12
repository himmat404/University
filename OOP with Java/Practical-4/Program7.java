public class Program7 {
    public static double area(double side) {
        return side * side;
     }
     public static double area(double length, double width) {
        return length * width;
     }
     /*public static double area(double radius) {
        return Math.PI * radius * radius;
     }*/
     public static void main(String[] args) {
        System.out.println("Area of square with side 5.0 is " + area(5.0));
        System.out.println("Area of rectangle with length 5.0 and width 4.0 is " + area(5.0, 4.0));
        System.out.println("Area of circle with radius 4.0 is " + area(4.0));
     }
}
