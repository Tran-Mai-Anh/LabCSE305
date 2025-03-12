import java.util.List;

public class PepperoniPizza implements PizzaFactory {

    @Override
    public Pizza createPizza(String size, String crust, String sauce, List<String> toppings) {
        toppings.add("Pepperoni");
        return new Pizza(size, crust, sauce, toppings);
    }

}
