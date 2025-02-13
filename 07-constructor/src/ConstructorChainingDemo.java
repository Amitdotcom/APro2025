class Student {
    private String name;
    private int rollNo;
    private double percentage;

    // Default Constructor (No Arguments)
    public Student() {
        this("Unknown", 0); // Calls Constructor 2
        System.out.println("Default Constructor Called");
    }

    // Constructor with Two Parameters
    public Student(String name, int rollNo) {
        this(name, rollNo, 0.0); // Calls Constructor 3
        System.out.println("Constructor with Name and RollNo Called");
    }

    // Constructor with All Parameters
    public Student(String name, int rollNo, double percentage) {
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
        System.out.println("Constructor with Name, RollNo, and Percentage Called");
    }

    // Display Student Details
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Percentage: " + percentage);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        // Creating Student object using default constructor
        Student student1 = new Student();
        student1.display();

        System.out.println("----------------------");

        // Creating Student object using constructor with name and rollNo
        Student student2 = new Student("Amit", 101);
        student2.display();

        System.out.println("----------------------");

        // Creating Student object using constructor with all parameters
        Student student3 = new Student("Rahul", 102, 85.5);
        student3.display();
    }
}
