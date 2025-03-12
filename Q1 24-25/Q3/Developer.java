package Q3;

public class Developer extends Employee {
    public Developer(String firstName, String lastName, String email, String department, double salary) {
        super(firstName, lastName, email, department, salary, ROLE.DEVELOPER);
    }
}