package Q3;

public class ProfessionalCalculator implements Calculator {
    private int operand1, operand2;
    private String result;

    @Override
    public void setOperand(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public int addition() {
        return operand1 + operand2;
    }

    @Override
    public int subtraction() {
        return operand1 - operand2;
    }

    @Override
    public String multiplication() {
        return String.valueOf(operand1 * operand2);
    }

    @Override
    public String division() {
        return (operand2 != 0) ? String.valueOf((double) operand1 / operand2) : "Error: Division by zero";
    }

    @Override
    public void calculate(Operation operation) {
        switch (operation) {
            case ADDITION -> result = String.valueOf(addition());
            case SUBTRACTION -> result = String.valueOf(subtraction());
            case MULTIPLICATION -> result = multiplication();
            case DIVISION -> result = division();
            default -> result = "Invalid operation";
        }
    }

    @Override
    public String getResult() {
        return result;
    }
}