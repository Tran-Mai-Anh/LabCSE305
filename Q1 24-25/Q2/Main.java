import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter student id: ");
        String id1 = sc.nextLine();
        CardBuilder studentBuilder = new StudentBuilder();
        CardDirector studentDirector = new CardDirector(studentBuilder);
        User studentCard = studentDirector.createCard(id1);

        System.out.println("Enter lecturer id: ");
        String id2 = sc.nextLine();
        CardBuilder lecturerBuilder = new LecturerBuilder();
        CardDirector lecturerDirector = new CardDirector(lecturerBuilder);
        User lecturerCard = lecturerDirector.createCard(id2);

        System.out.println("Enter admin id: ");
        String id3 = sc.nextLine();
        CardBuilder adminBuilder = new AdminBuilder();
        CardDirector adminDirector = new CardDirector(adminBuilder);
        User adminCard = adminDirector.createCard(id3);

        System.out.println("Student information");
        studentCard.printInfo();
        System.out.println();

        System.out.println("Lecturer information");
        lecturerCard.printInfo();
        System.out.println();

        System.out.println("Admin information");
        adminCard.printInfo();
    }
}
