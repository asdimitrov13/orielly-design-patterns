package decorator.starbuzz.condiments;

import decorator.starbuzz.bevareges.Beverage;

public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
