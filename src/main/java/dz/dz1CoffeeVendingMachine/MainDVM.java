package dz.dz1CoffeeVendingMachine;

import dz.dz1CoffeeVendingMachine.drinks.Warming;
import dz.dz1CoffeeVendingMachine.drinks.Coffee;

import java.util.Scanner;

public class MainDVM {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.addDrink(new Coffee("Эспрессо", 60, 100, "арабика", "крепкий", false))
                .addDrink(new Coffee("Американо", 200, 100, "арабика", "слабый", false))
                .addDrink(new Coffee("Американо с молоком", 200, 100, "арабика", "слабый", true))
                .addDrink(new Coffee("Капучино", 200, 150, "арабика", "крепкий", true))
                .addDrink(new Coffee("Латте", 200, 150, "арабика", "средний", true))
                .addDrink(new Warming("Горячий шоколад", 200, 100, "какао"))
                .addDrink(new Drink("Вода", 200, 40));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать.\nВ наличии:");
        while (true) {
            System.out.println(machine);
            System.out.println("Введите название напитка");

            String input = scanner.nextLine();
            if (!input.equals("2717")) {
                if (machine.sellingDrink(input)) {
                    System.out.println("Напиток готовится");
                    for (int i = 0; i <= 100; i += 10) {
                        progressBar(i);
                        try {
                            Thread.sleep(1000); // имитация длительной операции
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("Напиток готов\nДо свидания");
                } else {
                    System.out.println("Такого напитка нет");
                }
            } else {
                label:
                while (true) {
                    System.out.println("""
                            1 - проверить кассу
                            2 - проверить запасы
                            3 - открыть отсек для пополнения
                            0 - выход\s""");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1":
                            System.out.println(machine.getCash());
                            break;
                        case "2":
                            System.out.println(machine.checkStocks());
                            break;
                        case "3":
                            machine.restockDrink();
                            System.out.println("Запасы сырья пополнены");
                            break;
                        case "0":
                            break label;
                    }
                }
            }
        }
    }

    public static void progressBar(int progress) {
        int blocks = progress / 10;
        for (int i = 0; i < 10; i++) {
            if (i < blocks) {
                System.out.print("\u2588"); // полный блок
            } else {
                System.out.print("\u2591"); // пустой блок
            }
        }
        System.out.print(progress + "%\r");
    }

}
