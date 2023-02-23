class Complex {
    int real;
    int imaginary;

    Complex(){}
    Complex(int r,int i){
        real = r;
        imaginary = i;
    }   
}

public class Complexnum {
    public static void main(String[] args) {

        Complex c1=new Complex(3,5);
        Complex c2 =  new Complex(7,8);

        Complex add = new Complex();

        add = Addition(c1,c2);

        System.out.print("Addition of Complex number is: " ) ;
        System.out.println( c1.real+"+"+c1.imaginary+"i + "+c2.real+"+"+c2.imaginary+"i = "+add.real+"+"+add.imaginary+"i ");

    }

    static Complex Addition(Complex c1,Complex c2){

        Complex sum = new Complex();
        sum.real = c1.real + c2.real ;
        sum.imaginary = c1.imaginary + c2.imaginary;
        return sum;
    }
}
