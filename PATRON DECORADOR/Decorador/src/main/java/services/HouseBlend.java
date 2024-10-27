package services;

public class HouseBlend extends Beverage {
    public HouseBlend () {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String toString() {
        return "HouseBlend{" +
                '\'' + "description" + '\'' + "=" + '\'' + description + '\'' +
                '}';
    }
}