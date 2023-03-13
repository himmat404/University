class Computer {

    String name;
    int ram;

    public Computer(String name,int ram){
        this.name = name; // Using "this" to refer to the current class instance variable name
        this.ram = ram; // // Using "this" to refer to the current class instance variable ram
    }
    public Computer(String name){
        this(name,0); // Using "this" to invoke the other constructor in the same class
    }

    public void getDetail() {
        System.out.println("Name :"+this.name+" Ram :"+this.ram+" GB"); 
        // Using "this" to refer to the current class instance variable
    }
    public void upgrade() {
        this.upgrade(16); // Using "this" to invoke the other method in the same class
    }
    public void upgrade(int n) {
        this.ram = n; // Using "this" to refer to the current class instance variable ram
        System.out.println("Name :"+this.name+" its upgraded Ram :"+this.ram+" GB");
    }
}
public class Program4 {
    public static void main(String[] args) {

        Computer pc1 = new Computer("HP Spectre x360",8);
        Computer pc2 = new Computer("HP Pavilion AMD Ryzen");

        pc1.getDetail();
        pc2.upgrade();
        pc2.upgrade(32);
        
    }    
}