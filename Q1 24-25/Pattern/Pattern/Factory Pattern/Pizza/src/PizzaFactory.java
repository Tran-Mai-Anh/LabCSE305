import java.util.List;

public interface PizzaFactory {
    Pizza createPizza(String size, String crust, String sauce, List<String> toppings);
}
