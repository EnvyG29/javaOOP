package dz.dz1CoffeeVendingMachine.drinks;

import dz.dz1CoffeeVendingMachine.Drink;

public class Warming extends Drink {
    private final String beans;

    public Warming(String name, int volume, int prise, String beans) {
        super(name, volume, prise);
        this.beans = beans;
    }

    @Override
    public String toString() {
        return String.format("Согревающий напиток: %s, основа: %s", super.toString(), beans);
    }
}
