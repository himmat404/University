class Employee {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Employee(Employee emp) {
        this.id = emp.id;
        this.name = emp.name;
        this.age = emp.age;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Program2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1111, "Employee 1", 20);
        Employee emp2 = new Employee(emp1); // Using the copy constructor
        System.out.println(emp2.getId()); 
        System.out.println(emp2.getName()); 
        System.out.println(emp2.getAge()); 

        emp2.setId(2222);
        emp2.setName("Employee 2");
        emp2.setAge(23);
        
        System.out.println(emp1.getId()); 
        System.out.println(emp1.getName());
        System.out.println(emp1.getAge()); 

        System.out.println(emp2.getId()); 
        System.out.println(emp2.getName()); 
        System.out.println(emp2.getAge()); 
    }
}
