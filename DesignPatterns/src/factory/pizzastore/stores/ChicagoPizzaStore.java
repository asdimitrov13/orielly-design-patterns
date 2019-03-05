package factory.pizzastore.stores;

import factory.pizzastore.pizzas.ChicagoStyleCheesePizza;
import factory.pizzastore.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")){
            return null;
        } else if (type.equals("clam")) {
            return null;
        } else if (type.equals("pepperoni")) {
            return null;
        } else return null;
    }
}
