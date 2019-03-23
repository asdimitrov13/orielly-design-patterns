package factory.pizzastore.stores;

import factory.pizzastore.ingredients.factories.NYPizzaIngredientFactory;
import factory.pizzastore.ingredients.factories.PizzaIngredientFactory;
import factory.pizzastore.pizzas.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

       switch (type) {
           case "cheese":
               pizza = new CheesePizza(ingredientFactory);
               pizza.setName("New York Style Cheese Pizza");
               break;
           case "veggie":
               pizza = new VeggiePizza(ingredientFactory);
               pizza.setName("New York Style Veggie Pizza");
               break;
           case "clam":
               pizza = new ClamPizza(ingredientFactory);
               pizza.setName("New York Style Clam Pizza");
               break;
           case "pepperoni":
               pizza = new PepperoniPizza(ingredientFactory);
               pizza.setName("New York Style Pepperoni Pizza");
               break;
               default:
                   System.out.println("Invalid pizza type");
                   pizza = null;
       }
       return pizza;
    }
}
