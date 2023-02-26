import java.util.Scanner;
public class FactRecursion {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (1-20) : ");
        long num = input.nextLong();
        System.out.println("Factorial of "+num+" is "+fact(num));
    }
    static long fact(long n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}