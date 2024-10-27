package services.decorador;

import services.Beverage;

public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha( Beverage beverage ) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Mocha";
    }
}
