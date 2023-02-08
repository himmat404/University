import static java.lang.System.*;
import java.util.Scanner;

public class Per {
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

        out.println("The Total marks obtained is "+Tmarks);
        out.println("Percentage : "+per);
    }
}
