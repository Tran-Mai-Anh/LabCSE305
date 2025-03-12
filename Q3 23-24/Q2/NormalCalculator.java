package Q2;

public class NormalCalculator implements Calculator {
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
        return "Operation not support";
    }

    @Override
    public String division() {
        return "Operation not support";
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