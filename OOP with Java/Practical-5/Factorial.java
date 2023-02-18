import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number (1-20) : ");
        int num = input.nextInt();

        int n = num;
        long fact=1;
        while(n>1){
            fact = fact*n;
            n--;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}