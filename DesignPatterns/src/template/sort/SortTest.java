package template.sort;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Rick", 8),
                new Duck("Morty", 5),
                new Duck("Jerry", 7),
                new Duck("Summer", 4),
                new Duck("Mr Meseeks", 3),
                new Duck("Beth", 6)
        };

        System.out.println("Before sort");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("After sort");
        display(ducks);

    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
