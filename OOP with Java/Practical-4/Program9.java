import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        

        double balance,amount;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter initial balance: ");
        balance = in.nextDouble();
        
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                amount = in.nextDouble();
                deposit(balance,amount);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                amount = in.nextDouble();
                withDraw(balance,amount);
                break;
            case 3:
                System.out.println("Balance: "+balance);
            break;
        default:
          System.out.println("Invalid choice. Try again");
      }

    }
    static void deposit(double balance,double amount){

        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }
    static void withDraw(double balance,double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Current balance: " + balance);
        }else {
            System.out.println("Insufficient balance");
        }
    }
}