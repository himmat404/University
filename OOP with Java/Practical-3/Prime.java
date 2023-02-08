import static java.lang.System.*;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        out.print("Enter the number : ");
        int n = in.nextInt();

        int r=1;
        if (n == 0 || n == 1) {
            r = 0;
        }
        int i=2;
        while(i<=n/2){

            if( n%i==0 ){
                r=0;
                break;
            }
            i++;
        }

        if(r==1){
            out.println(n+" is a Prime Number ");
        }else {
            out.println(n+" is not a Prime Number ");

        }
    }
}
