package dz.dz1CoffeeVendingMachine;

public class Drink {
    protected String name;
    protected int volume;
    protected int prise;

    public Drink(String name, int volume, int prise) {
        this.name = name;
        this.volume = volume;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return String.format("%s, объем %d, цена %d", name, volume, prise);
    }
}
