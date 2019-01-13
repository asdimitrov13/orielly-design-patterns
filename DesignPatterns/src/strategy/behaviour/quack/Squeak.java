package strategy.behaviour.quack;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squak");
    }
}
