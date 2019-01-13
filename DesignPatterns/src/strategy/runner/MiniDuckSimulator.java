package strategy.runner;

import strategy.ducks.Duck;
import strategy.ducks.ModelDuck;
import strategy.behaviour.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck rocketDuck = new ModelDuck();
        rocketDuck.setFlyBehaviour(new FlyRocketPowered());
        rocketDuck.performFly();
        rocketDuck.performQuack();
    }
}
