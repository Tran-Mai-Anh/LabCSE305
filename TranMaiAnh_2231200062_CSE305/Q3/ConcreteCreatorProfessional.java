package Q3;

public class ConcreteCreatorProfessional implements Creator {
    @Override
    public Calculator createCalculator() {
        return new ProfessionalCalculator();
    }
}