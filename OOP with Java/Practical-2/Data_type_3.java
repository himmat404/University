import java.util.Scanner;
import static java.lang.System.*;

public class Data_type_3 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        out.print("Enter the Employee Name : ");
        String Name = sc.nextLine();
        out.print("Enter the Id : ");
        int id=sc.nextInt();
        out.print("Department : ");
        String Department=sc.next();
        out.print("Gender (M/F/O) : ");
        char gender=sc.next().charAt(0);
        out.print("Salary : ");
        float salary=sc.nextFloat();

        out.println();
        out.println("Employee Detail :- ");
        out.println("Name : "+Name);
        out.println("Id : "+id);
        out.println("Department : "+Department);
        out.println("Gender : "+gender);
        out.println("Salary : "+salary);
    }
}
