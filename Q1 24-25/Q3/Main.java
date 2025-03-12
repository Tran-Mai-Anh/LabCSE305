package Q3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        System.out.println("Enter student first name: ");
        String firstName1 = sc.nextLine();
        System.out.println("Enter student last name: ");
        String lastName1 = sc.nextLine();
        Employee emp1 = new Manager(firstName1, lastName1, "student@email.com", "HR", 5000);
        manager.addEmployee(emp1);

        System.out.println("Enter developer first name: ");
        String firstName2 = sc.nextLine();
        System.out.println("Enter developer last name: ");
        String lastName2 = sc.nextLine();
        Employee emp2 = new Developer(firstName2, lastName2, "developer@email.com", "IT", 4000);
        manager.addEmployee(emp2);

        System.out.println("Enter tester first name: ");
        String firstName3 = sc.nextLine();
        System.out.println("Enter tester last name: ");
        String lastName3 = sc.nextLine();
        Employee emp3 = new Tester(firstName3, lastName3, "tester@email.com", "QA", 3500);
        manager.addEmployee(emp3);

        System.out.println("\nPromoting a Developer to Manager...");
        manager.promoteEmployee(emp2, ROLE.MANAGER, 6000);

        System.out.println("\nRemoving a Tester...");
        manager.removeEmployee(emp3);

    }
}