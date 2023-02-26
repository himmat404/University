import java.util.Scanner;

class Employee {
    
    double salary;
    int hoursOfWork;

    void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }
    void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }
    void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }
    double getSalary() {
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Salary: ");
        int x = in.nextInt();
        System.out.print("No. of hours of work per day: ");
        int y = in.nextInt();
        emp.getInfo(x, y);
        emp.addSal();
        emp.addWork();
        System.out.println("Final salary: " + emp.getSalary());

    }
}