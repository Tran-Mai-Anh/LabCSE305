package Q3;

public class ConcreteCreatorNormal implements Creator {
    @Override
    public Calculator createCalculator() {
        return new NormalCalculator();
    }
}