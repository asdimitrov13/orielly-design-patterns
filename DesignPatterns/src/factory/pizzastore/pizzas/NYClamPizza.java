package factory.pizzastore.pizzas;

public class NYClamPizza extends Pizza {

    public NYClamPizza() {
        name = "NY Clam pizza";
        dough = "Thin Crust";
        sauce = "Marinara";

        toppings.add("Reggiano");
        toppings.add("Fresh Clams");
    }
}
