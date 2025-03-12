package Q3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Added " + employee.role + ": " + employee.firstName + " " + employee.lastName);
        employee.sendWelcomeEmail();
    }

    public void promoteEmployee(Employee employee, ROLE newRole, double newSalary) {
        employee.promote(newSalary);
    }

    public void removeEmployee(Employee employee) {
        employee.remove();
        employees.remove(employee);
    }
}
