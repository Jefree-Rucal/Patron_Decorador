package services;

public class DarkRoast extends Beverage {
    public DarkRoast () {
        description = "Most Excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }

    @Override
    public String toString() {
        return "DarkRoast{" +
                '\'' + "description" + '\'' + "=" + '\'' + description + '\'' +
                '}';
    }
}