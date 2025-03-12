import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        PizzaFactory factory = new StandardPizzaFactory();
        List<String> toppings1 = new ArrayList<>(Arrays.asList("Mushroom", "Pepperoni"));
        Pizza pizza1 = factory.createPizza("Large", "Thin", "Tomato", toppings1);
        List<String> toppings2 = new ArrayList<>(Arrays.asList("Chicken"));
        Pizza pizza2 = factory.createPizza("Medium", "Thick", "BBQ", toppings2);
        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
