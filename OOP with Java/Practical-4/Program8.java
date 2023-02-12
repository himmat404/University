class Rectangle {
    private double length;
    private double width;
  
    // No-arg constructor
    public Rectangle() {
       this.length = 1.0;
       this.width = 1.0;
    }
  
    // Constructor with length and width arguments
    public Rectangle(double length, double width) {
       this.length = length;
       this.width = width;
    }
  
    // Constructor with a single argument
    public Rectangle(double side) {
       this.length = side;
       this.width = side;
    }
  
    public double getLength() {
       return length;
    }
  
    public double getWidth() {
       return width;
    }
  
    public double getArea() {
       return length * width;
    }
 }
  
 class Program8 {
    public static void main(String[] args) {
       Rectangle rectangle1 = new Rectangle();
       System.out.println("Length of rectangle1: " + rectangle1.getLength());
       System.out.println("Width of rectangle1: " + rectangle1.getWidth());
       System.out.println("Area of rectangle1: " + rectangle1.getArea());
       System.out.println();
  
       Rectangle rectangle2 = new Rectangle(5, 4);
       System.out.println("Length of rectangle2: " + rectangle2.getLength());
       System.out.println("Width of rectangle2: " + rectangle2.getWidth());
       System.out.println("Area of rectangle2: " + rectangle2.getArea());
       System.out.println();
  
       Rectangle rectangle3 = new Rectangle(5);
       System.out.println("Length of rectangle3: " + rectangle3.getLength());
       System.out.println("Width of rectangle3: " + rectangle3.getWidth());
       System.out.println("Area of rectangle3: " + rectangle3.getArea());
    }
 }
 