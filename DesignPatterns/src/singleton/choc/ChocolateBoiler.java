package singleton.choc;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void darin() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            boiled = false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }
}
