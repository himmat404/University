import java.util.Scanner;
class Program6 {
   public static boolean isArmstrong(int num) {
      int originalNum = num;
      int result = 0;
      int n = 0;
 
      while (originalNum != 0) {
         originalNum /= 10;
         ++n;
      }

      originalNum = num;
      while (originalNum != 0) {
         int remainder = originalNum % 10;
         result += Math.pow(remainder, n);
         originalNum /= 10;
      }
      return result == num;
   }
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int num = input.nextInt();

      if (isArmstrong(num)) {
         System.out.println(num + " is an Armstrong number");
      } else {
         System.out.println(num + " is not an Armstrong number");
      }
   }
}