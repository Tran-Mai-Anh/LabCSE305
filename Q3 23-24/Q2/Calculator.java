package Q2;

public interface Calculator {
    void setOperand(int operand1, int operand2);
    int addition();
    int subtraction();
    String multiplication();
    String division();
    void calculate(Operation operation);
    String getResult();
}