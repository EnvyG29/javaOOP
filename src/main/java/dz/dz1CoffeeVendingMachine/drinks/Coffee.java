package dz.dz1CoffeeVendingMachine.drinks;

import dz.dz1CoffeeVendingMachine.Drink;

public class Coffee extends Drink {
    private final String sort;
    private final String strength;
    private final boolean milk;

    public boolean isMilk() {
        return milk;
    }

    public Coffee(String name, int volume, int prise, String coffee, String strength, boolean milk) {
        super(name, volume, prise);
        this.sort = coffee;
        this.strength = strength;
        this.milk = milk;
    }

    @Override
    public String toString() {
        return String.format("Кофе: %s, сорт: %s, крепость: %s, молоко: %b", super.toString(), sort, strength, milk);
    }
}
