import java.util.Scanner;
import static java.lang.System.*;

public class Area {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float area;

        out.println("For which shapes you want Area ?");
        out.println("a. Circle ");
        out.println("b. Rectangle ");
        out.println("c. Square ");
        out.println("d. Right Angle Triangle ");

        out.print("Your response : ");
        String choice = in.next();

        switch (choice) {
            case "a":
            case "A":
                out.print("Enter the Radius of circle : ");
                float r = in.nextFloat();
                area = (22/7)*r*r;
                out.print("Area of circle : "+area);
                break;
            case "b":
            case "B":
                out.print("Enter the Width of Rectangle : ");
                float w = in.nextFloat();
                out.print("Enter the Length of Rectangle : ");
                float l = in.nextFloat();
                area = w*l;
                out.print("Area of Rectangale : "+area);
                break;
            case "c":
            case "C":
                out.print("Enter the side length of square : ");
                float s = in.nextFloat();
                area = s*s;
                out.print("Area of Square : "+area);
                break;
            case "d":
            case "D":
                out.print("Enter the Height of Right Angle Triangle : ");
                float h = in.nextFloat();
                out.print("Enter the Base of Right Angle Triangle : ");
                float b = in.nextFloat();
                area = (h*b)/2;
                out.print("Area of Right Angle Triangle : "+area);
                break;

            default:
                out.println("Invalid Input !!!");
                out.print("Enter the choice from a,b,c,d");
                break;
        }


    }
}
