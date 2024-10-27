package services.decorador;

import services.Beverage;

public class SteamedMilk extends Condiment {
    Beverage beverage;

    public SteamedMilk( Beverage beverage ) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with SteamedMilk";
    }
}