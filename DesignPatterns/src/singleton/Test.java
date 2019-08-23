package singleton;

import singleton.choc.ChocolateBoiler;

public class Test {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
    }
}
