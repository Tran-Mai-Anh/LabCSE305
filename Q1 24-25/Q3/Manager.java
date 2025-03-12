package Q3;


public class Manager extends Employee {
    public Manager(String firstName, String lastName, String email, String department, double salary) {
        super(firstName, lastName, email, department, salary, ROLE.MANAGER);
    }
}
