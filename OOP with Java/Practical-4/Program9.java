import java.util.Scanner;
import static java.lang.System.*;
public class Program9 {
    public static void main(String[] args) {
        
        double balance,amount;
        Scanner in = new Scanner(System.in);

        out.print("Enter initial balance: ");
        balance = in.nextDouble();
        
        out.println("1. Deposit");
        out.println("2. Withdraw");
        out.println("3. Check Balance");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                out.print("Enter amount to deposit: ");
                amount = in.nextDouble();
                deposit(balance,amount);
                break;
            case 2:
                out.print("Enter amount to withdraw: ");
                amount = in.nextDouble();
                withDraw(balance,amount);
                break;
            case 3:
                out.println("Balance: "+balance);
            break;
        default:
          out.println("Invalid choice. Try again");
      }

    }
    static void deposit(double balance,double amount){

        balance += amount;
        out.println("Amount deposited: " + amount);
        out.println("Current balance: " + balance);
    }
    static void withDraw(double balance,double amount){
        if(balance >= amount){
            balance -= amount;
            out.println("Amount withdrawn: " + amount);
            out.println("Current balance: " + balance);
        }else {
            out.println("Insufficient balance");
        }
    }
}