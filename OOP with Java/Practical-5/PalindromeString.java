import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str = input.next();

        if(palindrome(str))
            System.out.println("The word "+str+" is Palindrome. ");
        else
            System.out.println("The word "+str+" is not a Palindrome. ");
    }
    static boolean palindrome(String word){

        int firstIndex = 0;
        int lastIndex = word.length() - 1;
        while(firstIndex < lastIndex){
            if(word.charAt(firstIndex)!=word.charAt(lastIndex)){
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}