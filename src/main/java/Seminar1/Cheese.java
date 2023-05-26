package Seminar1;

public class Cheese extends Product{
    private final String cheeseType;
    private final double weight;

    public Cheese(String pName, double pPrise, String cheeseType, double weight) {
        super(pName, pPrise);
        this.cheeseType = cheeseType;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Cыр %s, Тип %s, Вес %f", super.toString(), cheeseType, weight);
    }
}
