package Seminar1;

public class Chocolate  extends Product {
    private final String chColor;
    private final String chType;
    private final int chCalories;

    public Chocolate(String pName, double pPrise, String chColor, String chType, int chCalories) {
        super(pName, pPrise);
        this.chColor = chColor;
        this.chType = chType;
        this.chCalories = chCalories;
    }

    @Override
    public String toString() {
        return String.format("Шоколад %s, цвет %s, вкус %s, калории %d", super.toString(), chColor, chType, chCalories);
    }

}
