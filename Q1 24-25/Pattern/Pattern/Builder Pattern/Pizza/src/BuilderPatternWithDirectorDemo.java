public class BuilderPatternWithDirectorDemo {
    public static void main(String[] args) {
        PizzaBuilder builder = new CustomPizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder);
        Pizza pizza = director.buildCustomPizza();
        System.out.println(pizza);
    }
}
