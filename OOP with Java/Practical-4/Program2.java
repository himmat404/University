class Triangle {

    int x = 3;
    int y = 4;
    int z = 5;

    int perimeter() {

        int ans = x+y+z;
        return ans;
    }
    float area() {

        float ans = (x*y)/2;
        return ans;
    }
}
public class Program2 {
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();

        System.out.println("The perimeter of Triangle : "+t1.perimeter());
        System.out.println("The area of Triangle : "+t1.area());
    }
}