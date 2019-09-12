package template.beverage;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brew tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
