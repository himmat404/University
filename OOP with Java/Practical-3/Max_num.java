import static java.lang.System.*;
import java.util.Scanner;

public class Max_num {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int a,b,c;
        out.print("Enter the 1st No. : ");
        a = in.nextInt();
        out.print("Enter the 2nd No. : ");
        b = in.nextInt();
        out.print("Enter the 3rd No. : ");
        c = in.nextInt();

        if(a>b){
            if(a>c){
                out.println("The maximum number is "+a);
            }else {
                out.println("The maximum number is "+c);
            }
        }else {
            if(b>c){
                out.println("The maximum number is "+b);
            }else {
                out.println("The maximum number is "+c);
            }
        }

    }
}
