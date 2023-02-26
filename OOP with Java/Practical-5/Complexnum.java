import java.util.Scanner;

class Complex {
    int real;
    int imaginary;

    Complex(){}
    Complex(int r,int i){
        real = r;
        imaginary = i;
    }
    Complex Addition(Complex c1,Complex c2){

        Complex sum = new Complex();
        sum.real = c1.real + c2.real ;
        sum.imaginary = c1.imaginary + c2.imaginary;
        return sum;
    }
    Complex Subtraction(Complex c1,Complex c2){

        Complex sum = new Complex();
        sum.real = c1.real - c2.real ;
        sum.imaginary = c1.imaginary - c2.imaginary;
        return sum;
    }
    Complex Multiplication(Complex c1,Complex c2){

        Complex sum = new Complex();
        sum.real = c1.real*c2.real - c1.imaginary*c2.imaginary ;
        sum.imaginary = c1.real*c2.imaginary + c1.imaginary*c2.real ;
        return sum;
    }
    Complex Division(Complex c1,Complex c2){

        Complex sum = new Complex();
        sum.real = c1.real - c2.real ;
        sum.imaginary = c1.imaginary - c2.imaginary;
        return sum;
    }
}

public class Complexnum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 1st Complex Number - ");
        System.out.print("Real : ");
        int x = in.nextInt();
        System.out.print("Imaginary : ");
        int y = in.nextInt();

        Complex c1=new Complex(x,y);

        System.out.println("Enter the 2nd Complex Number - ");
        System.out.print("Real : ");
        x = in.nextInt();
        System.out.print("Imaginary : ");
        y = in.nextInt();

        Complex c2 =  new Complex(x,y);

        Complex c3 = new Complex();


        c3.Addition(c1, c2);
        System.out.println("Addition of ( "+c1.real+" "+c1.imaginary+"i ) + ( "+c2.real+" ");
        c3.Subtraction(c1, c2);
        c3.Multiplication(c1, c2);
        c3.Division(c1, c2);

    }

}
