public class Program1 {
    
    // static variable
    static int count = 0;
    // static block
    static {
        System.out.println("Static block executed.");
    }
    // static method
    static void incrementCount() {
        count++;
    }
    public static void main(String[] args) {

        // calling static method
        incrementCount();
        
        // accessing static variable
        System.out.println("Count: " + count);
    }
}