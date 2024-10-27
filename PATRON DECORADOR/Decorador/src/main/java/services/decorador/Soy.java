package services.decorador;

import services.Beverage;

public class Soy extends Condiment {
    Beverage beverage;

    public Soy( Beverage beverage ) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Soy";
    }
}

