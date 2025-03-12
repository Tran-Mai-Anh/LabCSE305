package Q3;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String department;
    protected double salary;
    protected ROLE role;

    public Employee(String firstName, String lastName, String email, String department, double salary, ROLE role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.role = role;
    }

    public void sendWelcomeEmail() {
        System.out.println("Sending welcome email to " + email);
    }

    public void promote(double newSalary) {
        System.out.println("Promoting " + firstName + " " + lastName + " to " + role);
        this.salary = newSalary;
        System.out.println("New salary is: " + salary);
    }

    public void remove() {
        System.out.println("Removing " + role + ": " + firstName + " " + lastName);
    }

    public void printInfo() {
        System.out.println("ID: " + firstName + " " + lastName);
        System.out.println("Role: " + role);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
