package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final List<Product> vending = new ArrayList<>();
    private double cash = 0;

    public double getCash() {
        return cash;
    }

    public List<Product> getVending() {
        return vending;
    }

    public VendingMachine addProduct(Product prod) {
        vending.add(prod);
        return this;
    }

    public Product findProduct(String name) {
        for (Product prod : vending) {
            if (name.equals(prod.getpName())) {
                return prod;
            }
        }
        return null;
    }

    public Product saleProduct(String nameProd) {
        Product founded = findProduct(nameProd);
        if (founded != null) {
            cash += founded.getpPrise();
            vending.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder buil = new StringBuilder();
        buil.append("денег в автомате: ").append(cash).append("\n");
        for (Product prod : vending) {
            buil.append(prod).append("\n");
        }
        return buil.toString();
    }
}
