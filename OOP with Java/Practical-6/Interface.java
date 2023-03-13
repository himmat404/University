// Define an interface named Shape
interface Shape {
    double getArea(); // Abstract method to calculate the area of the shape
    double getPerimeter(); // Abstract method to calculate the perimeter of the shape
}
// Implement the Shape interface for a rectangle
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
public class Interface {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10); // Create a new Rectangle object with width = 5 and height = 10
        double area = r.getArea(); // Calculate the area of the rectangle
        double perimeter = r.getPerimeter(); // Calculate the perimeter of the rectangle
        System.out.println("Area = " + area + ", Perimeter = " + perimeter); // Print the area and perimeter of the rectangle
    }
}