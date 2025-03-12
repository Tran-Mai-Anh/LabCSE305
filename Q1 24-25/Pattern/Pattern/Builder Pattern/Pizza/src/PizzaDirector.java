public class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza buildCustomPizza() {
        builder.setSize("Large");
        builder.setCrust("Thin");
        builder.setSauce("Tomato");
        builder.addTopping("Mushrooms");
        builder.addTopping("Pepperoni");
        return builder.build();
    }
}
