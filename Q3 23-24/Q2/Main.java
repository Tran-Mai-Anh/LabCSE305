package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose mode (1 - Normal, 2 - Professional): ");
        int mode = scanner.nextInt();
        
        Creator factory;
        if (mode == 1) {
            factory = new ConcreteCreatorNormal();
        } else {
            factory = new ConcreteCreatorProfessional();
        }

        Calculator calculator = factory.createCalculator();

        System.out.print("Enter first number: ");
        int operand1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int operand2 = scanner.nextInt();
        calculator.setOperand(operand1, operand2);

        System.out.print("Choose operations (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): ");
        int opChoice = scanner.nextInt();

        Operation operation;
        switch (opChoice) {
            case 1 -> operation = Operation.ADDITION;
            case 2 -> operation = Operation.SUBTRACTION;
            case 3 -> operation = Operation.MULTIPLICATION;
            case 4 -> operation = Operation.DIVISION;
            default -> {
                System.out.println("Invalid choice");
                scanner.close();
                return;
            }
        }

        calculator.calculate(operation);
        System.out.println("Result: " + calculator.getResult());

        scanner.close();
    }
}