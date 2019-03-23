package factory.pizzastore.pizzas;

import factory.pizzastore.ingredients.factories.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createChease();
        veggies = pizzaIngredientFactory.createVeggies();
        clams = pizzaIngredientFactory.createClams();
    }
}
