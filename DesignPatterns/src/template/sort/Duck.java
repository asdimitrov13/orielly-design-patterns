package template.sort;

public class Duck implements Comparable<Duck>{

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight) {
            return -1;
        }

        if (this.weight > otherDuck.weight) {
            return 1;
        }

        //must be equal
        return 0;
    }

    @Override
    public String toString() {
        return "Duck " + name + " weighs: " + weight;
    }
}
