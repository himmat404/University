class Student {

    private int enrollmentNo;
    private String name;
    private String gender;

    // Constructor with all data members
    public Student(int enrollmentNo, String name, String gender) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.gender = gender;
    }

    // Constructor with only enrollmentNo and name
    public Student(int enrollmentNo, String name) {
        this(enrollmentNo, name, "Unknown");
    }

    // Default constructor
    public Student() {
        this(0, "Unknown", "Unknown");
    }

    // Getter methods
    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    // Setter methods
    public void setEnrollmentNo(int enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

public class StudentDetail {
    public static void main(String[] args) {

        // Creating a new Student object with all data members
        Student s1 = new Student(4545, "Akash", "Male");
        System.out.println(s1.getEnrollmentNo());
        System.out.println(s1.getName());
        System.out.println(s1.getGender());

        System.out.println();

        // Setting new values using setter methods
        s1.setEnrollmentNo(6565);
        s1.setName("Yamini");
        s1.setGender("Female");
        System.out.println(s1.getEnrollmentNo()); 
        System.out.println(s1.getName());
        System.out.println(s1.getGender());

        System.out.println();

        // Creating a new Student object with only enrollmentNo and name
        Student s2 = new Student(8585, "Jignesh");
        System.out.println(s2.getEnrollmentNo()); 
        System.out.println(s2.getName());
        System.out.println(s2.getGender());

        System.out.println();

        // Creating a new Student object with default values
        Student s3 = new Student();
        System.out.println(s3.getEnrollmentNo());
        System.out.println(s3.getName());
        System.out.println(s3.getGender());
    }
}
