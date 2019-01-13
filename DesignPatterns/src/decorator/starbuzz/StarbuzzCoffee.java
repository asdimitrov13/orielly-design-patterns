package decorator.starbuzz;

import decorator.starbuzz.bevareges.Beverage;
import decorator.starbuzz.bevareges.DarkRoast;
import decorator.starbuzz.bevareges.Espresso;
import decorator.starbuzz.condiments.Mocha;
import decorator.starbuzz.condiments.Soy;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $"  + String.format("%.2f", beverage.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()));
    }
}
