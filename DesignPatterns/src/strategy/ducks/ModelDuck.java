package strategy.ducks;

import strategy.ducks.behaviour.fly.FlyNoWay;
import strategy.ducks.behaviour.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}