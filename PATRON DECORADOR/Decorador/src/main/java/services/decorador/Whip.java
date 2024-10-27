package services.decorador;

import services.Beverage;

public class Whip extends Condiment {
    Beverage beverage;

    public Whip( Beverage beverage ) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Whip";
    }
}