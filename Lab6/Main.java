import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            }

            Request request = createRequest(choice);
            if (request == null) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            request.setPriority();
            request.setStatus();
            request.setExpire();

            request.processRequest();
        }
    }

    private static void displayMenu() {
        System.out.println("1. Create Low-Priority Requests");
        System.out.println("2. Create Mid-Priority Requests");
        System.out.println("3. Create High-Priority Requests");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a valid choice: ");
            sc.next();
        }
        int choice = sc.nextInt();
        sc.nextLine(); 
        return choice;
    }

    private static Request createRequest(int choice) {
        RequestCreator creator;
        switch (choice) {
            case 1:
                creator = new LowPriorityConcreteCreator();
                break;
            case 2:
                creator = new MidPriorityConcreteCreator();
                break;
            case 3:
                creator = new HighPriorityConcreteCreator();
                break;
            default:
                return null;
        }
        return creator.createRequest();
    }

}