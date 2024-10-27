package services.decorador;

import services.Beverage;

public class Milk extends Condiment {
    Beverage beverage;

    public Milk ( Beverage beverage ) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with steamed milk";
    }
}
