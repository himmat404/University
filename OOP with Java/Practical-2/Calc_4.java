import java.util.Scanner;
import static java.lang.System.*;

public class Calc_4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x,y;
        
        out.print("Enter the 1 number : ");
        x = sc.nextInt();
        out.print("Enter the 2 number : ");
        y = sc.nextInt();

        out.println("a. "+x+" + "+y+" = "+(x+y) );
        out.println("b. "+x+" - "+y+" = "+(x-y) );
        out.println("c. "+x+" x "+y+" = "+(x*y) );
        out.println("d. "+x+" / "+y+" = "+((float)x/y) );
    }
}