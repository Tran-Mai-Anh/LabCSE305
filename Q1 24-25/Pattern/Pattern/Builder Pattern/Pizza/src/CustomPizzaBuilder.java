import java.util.ArrayList;
import java.util.List;

public class CustomPizzaBuilder implements PizzaBuilder {
    private String size;
    private String crust;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setCrust(String crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, crust, sauce, toppings);
    }
}
