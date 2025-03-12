import java.util.List;

public class StandardPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String size, String crust, String sauce, List<String> toppings) {
        return new Pizza(size, crust, sauce, toppings);
    }

}
