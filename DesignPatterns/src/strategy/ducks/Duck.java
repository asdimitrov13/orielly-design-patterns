package strategy.ducks;

import strategy.behaviour.fly.FlyBehaviour;
import strategy.behaviour.quack.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public  void performQuack() {
        quackBehaviour.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}
