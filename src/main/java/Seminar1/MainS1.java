package Seminar1;

public class MainS1 {
    public static void main(String[] args) {
        VendingMachine apparat = new VendingMachine();
        apparat.addProduct(new Chocolate("Alpen gold", 10, "темный", "с орехом", 100))
                .addProduct(new Product("Mars", 8))
                .addProduct(new Product("Pepsi", 5))
                .addProduct(new Cheese("Российский", 200, "твердый", 1000));

        System.out.println(apparat);
        Product product = apparat.findProduct("Mars");
        System.out.println(product);
        System.out.println("-------");
        Product saleProd = apparat.saleProduct("Pepsi");
        System.out.println(saleProd);
        Product saleProd2 = apparat.saleProduct(("Mars"));
        System.out.println(saleProd2);
        System.out.println(apparat.getCash());
        System.out.println("---");
        System.out.println(apparat);
    }
}
