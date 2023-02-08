import java.util.Scanner;
import static java.lang.System.*;

public class Si {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float p,r,t,calc;

        out.print("Principal Amount : ");
        p = in.nextFloat();
        out.print("Rate of Interest : ");
        r = in.nextFloat();
        out.print("Time Period (In Year) : ");
        t = in.nextFloat();

        calc = ((p*r*t)/100);

        out.println("Simple Interest is "+calc);

    }    
}
