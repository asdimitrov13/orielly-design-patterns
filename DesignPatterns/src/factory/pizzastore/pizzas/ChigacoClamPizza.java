package factory.pizzastore.pizzas;

public class ChigacoClamPizza extends Pizza{

    public ChigacoClamPizza() {
        name = "Chicago clam pizza";
        dough = "Thin crust";
        sauce = "Plum tomato sauce";

        toppings.add("mozzarella");
        toppings.add("clams");
        toppings.add("parmesan");
    }
}
