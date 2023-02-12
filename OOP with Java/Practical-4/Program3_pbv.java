//Passing by value
public class Program3_pbv {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before method call: " + num);
        changeValue(num);
        System.out.println("After method call: " + num);
     }
     public static void changeValue(int num) {
        num = 20;
     }
}