package adapter;

public class AdapterTest {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        duck.quack();
        duck.fly();

        TurkeyAdapter adaptedTurkey = new TurkeyAdapter(turkey);

        adaptedTurkey.quack();
    }
}
