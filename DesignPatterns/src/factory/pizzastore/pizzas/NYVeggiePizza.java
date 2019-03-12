package factory.pizzastore.pizzas;

public class NYVeggiePizza extends Pizza {

    public NYVeggiePizza() {
        name = "NY veggies pizza";
        dough = "Thin crust";
        sauce = "Marinara";

        toppings.add("Mushrooms");
        toppings.add("Onions");
        toppings.add("Peppers");
    }

}
