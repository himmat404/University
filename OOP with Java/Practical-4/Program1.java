import java.util.Scanner;
class Student {
    String name;
    int id;
}
public class Program1 {
    public static void main(String []args){

        Scanner in =  new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("Enter the Name of the Student : ");
        s1.name = in.nextLine();
        System.out.print("Roll No. : ");
        s1.id =  in.nextInt();

        System.out.println("Name : "+s1.name);
        System.out.println("Roll No. : "+s1.id );
    }
}