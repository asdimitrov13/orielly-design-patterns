package template.beverage;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();

        brew();

        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void  pourInCup() {
        System.out.println("Pouring in cup");
    }

    public abstract void addCondiments();

    //hook
    public boolean customerWantsCondiments() {
        return true;
    }
}
