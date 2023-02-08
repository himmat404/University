import static java.lang.System.*;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        out.print("Enter the number : ");
        int n = in.nextInt();

        int sum=0;
        int temp=n;

        while(temp>0){

            sum+=temp%10;
            temp/=10;
        }

        out.println("The sum of Digit of "+n+" is "+sum);
        
    }
}
