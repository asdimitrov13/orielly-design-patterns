package factory.pizzastore;

import factory.pizzastore.stores.ChicagoPizzaStore;
import factory.pizzastore.stores.NYPizzaStore;
import factory.pizzastore.stores.PizzaStore;

public class PizzaTestDrive {

    public static void main (String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("cheese");

        chicagoStore.orderPizza("cheese");
    }
}
