import static java.lang.System.*;
import java.util.Scanner;

public class Add_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        
        out.print("Enter the 1 number : ");
        a = sc.nextInt();
        out.print("Enter the 2 number : ");
        b = sc.nextInt();

        c=a+b;
        out.println("Addition of "+a+" & "+b+" is "+c);
    }
}
