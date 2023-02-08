import static java.lang.System.*;
import java.util.Scanner;

public class Sub_name_2 {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        String sub1,sub2,sub3;

        out.print("Enter the 1st Subject name : ");
        sub1=sc.next();
        out.print("Enter the 2nd Subject name : ");
        sub2=sc.next();
        out.print("Enter the 3rd Subject name : ");
        sub3=sc.next();

        out.println("Your Subject are "+sub1+", "+sub2+" & "+sub3);

    }
}
