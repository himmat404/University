//Passing by reference
class Num {
    int value;
 }

public class Program3_pbr {
    public static void main(String[] args) {
        
        int[] num = {10};
        System.out.println("Before method call: " + num[0]);
        changeValue(num);
        System.out.println("After method call: " + num[0]);
     }
    public static void changeValue(int[] n) {
        n[0] = 20;
    }
}