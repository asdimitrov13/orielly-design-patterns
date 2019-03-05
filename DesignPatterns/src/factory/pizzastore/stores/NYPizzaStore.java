package factory.pizzastore.stores;

import factory.pizzastore.pizzas.NYStyleCheesePizza;
import factory.pizzastore.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")){
            return null;
        } else if (type.equals("clam")) {
            return null;
        } else if (type.equals("pepperoni")) {
            return null;
        } else return null;
    }
}
