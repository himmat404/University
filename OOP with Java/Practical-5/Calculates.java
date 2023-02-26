public class Calculates {
    public static void main(String[] args) {
        
        int num=Integer.parseInt(args[0]);  

        if(num<=50000){
            System.out.println("Income tax is 0");
        }else if (num>50000 && num<=60000){
            System.out.println("Income tax is "+(num*0.1));
        }else if (num>60000 && num<=150000){
            System.out.println("Income tax is "+(num*0.2));
        }else if (num>150000){
            System.out.println("Income tax is "+(num*0.3));
        }
    }
}
