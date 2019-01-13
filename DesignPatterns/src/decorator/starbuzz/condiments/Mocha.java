package decorator.starbuzz.condiments;

import decorator.starbuzz.bevareges.Beverage;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
