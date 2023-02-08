import static java.lang.System.*;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        out.print("Enter the number of subject : ");
        int n = in.nextInt();

        float Tmarks=0,per,a;
        for(int i=1;i<=n;i++){

            out.print("Enter marks of "+i+" subject : ");
            a = in.nextFloat();
            Tmarks+=a;
        }
        per = Tmarks/n;

        int choice = (int)per/10;
        
        switch (choice) {
            case 10:
            case 9:
                out.println("Your Grade is A+");
                break;
            case 8:
            case 7:
                out.println("Your Grade is A");
                break;
            case 6:
                out.println("Your Grade is B");
                break;
            case 5:
                out.println("Your Grade is C");
                break;
            default:
                out.println("Your Grade is D");
                break;
        }
        
    }
}
