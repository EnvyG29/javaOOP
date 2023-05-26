package Seminar1;

public class Product {
    private final String pName;
    private final double pPrise;

    public String getpName() {
        return pName;
    }

    public Product(String pName, double pPrise) {
        this.pName = pName;
        this.pPrise = pPrise;
    }

    public double getpPrise() {
        return pPrise;
    }

    @Override
    public String toString() {

        return String.format("продукт: %s цена %f", pName, pPrise);
    }
}

