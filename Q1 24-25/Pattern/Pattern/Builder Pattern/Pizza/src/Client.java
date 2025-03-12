public class Client {
    public static void main(String[] args) throws Exception {
        // Pizza order1 = new Pizza("small", "thin", "tomato",
        // Arrays.asList("sausage"));
        // Pizza order2 = new Pizza("small", "thin", Arrays.asList("sausage"));
        // Pizza order3 = new Pizza("small", Arrays.asList("sausage"));
        Pizza order1 = new PizzaConcreteBuilder1()
                .setSize("Big")
                .setCrust("Thin")
                .setSauce("Tomato")
                .addTopping("Banana")
                .build();
        System.out.println(order1);
    }
}
