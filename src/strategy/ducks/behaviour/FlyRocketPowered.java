package strategy.ducks.behaviour;

import strategy.ducks.behaviour.fly.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
