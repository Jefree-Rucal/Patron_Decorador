package services;

import lombok.Getter;

@Getter
public abstract class Beverage {
    String description;

    public abstract double cost();
}