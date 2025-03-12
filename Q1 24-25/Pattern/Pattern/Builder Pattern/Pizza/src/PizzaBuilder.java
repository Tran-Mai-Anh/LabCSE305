public interface PizzaBuilder {
    PizzaBuilder setSize(String size);

    PizzaBuilder setCrust(String crust);

    PizzaBuilder setSauce(String sauce);

    PizzaBuilder addTopping(String topping);

    Pizza build();
}
