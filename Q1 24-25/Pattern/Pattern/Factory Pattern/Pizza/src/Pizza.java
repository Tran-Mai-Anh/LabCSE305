import java.util.List;

public class Pizza {
    private String size;
    private String crust;
    private String sauce;
    private List<String> toppings;

    public Pizza(String size, String crust, String sauce, List<String> toppings) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{size='" + size + "', crust='" + crust + "', sauce='" + sauce + "', toppings=" + toppings + "}";
    }
}
