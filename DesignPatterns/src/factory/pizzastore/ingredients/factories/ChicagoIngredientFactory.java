package factory.pizzastore.ingredients.factories;

import factory.pizzastore.ingredients.*;
import factory.pizzastore.ingredients.chicago.*;
import factory.pizzastore.ingredients.newyork.SlicedPepperoni;
import factory.pizzastore.ingredients.newyork.ThinCrustDough;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createChease() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
