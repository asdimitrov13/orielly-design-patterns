package factory.pizzastore.pizzas;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago pepperoni pizza";
        dough = "thin crust";
        sauce = "plum tomato sauce";

        toppings.add("mozzarella");
        toppings.add("parmesan");
        toppings.add("eggplant");
        toppings.add("spinach");
        toppings.add("black olives");
        toppings.add("pepperoni");
    }
}
