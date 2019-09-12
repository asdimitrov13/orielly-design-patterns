package template.beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee? (y/n)");

        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
