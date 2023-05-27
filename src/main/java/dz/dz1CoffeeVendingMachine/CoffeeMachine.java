package dz.dz1CoffeeVendingMachine;

import dz.dz1CoffeeVendingMachine.drinks.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private final List<Drink> vending = new ArrayList<>();
    public int cash = 1000;
    public int coffeeCapsules = 100;
    public int milkCapsules = 70;
    public int cacaoCapsules = 50;
    public int getCash() {
        return cash;
    }
    public CoffeeMachine addDrink(Drink drink){
        vending.add(drink);
        return this;
    }

    public Drink findDrink(String name){
        for (Drink dr: vending) {
            if (name.equals(dr.getName())){
                return dr;
            }
        }
        return null;
    }

    public Boolean sellingDrink(String name){
        Drink founded = findDrink(name);
        if (founded != null) {
            cash += founded.getPrise();
            if (founded.getClass().getSimpleName().equals("Coffee")){
                coffeeCapsules -= 1;
                Coffee cof = (Coffee) founded;
                if(cof.isMilk()){
                    milkCapsules -=1;
                }
            } else if (founded.getClass().getSimpleName().equals("Warming")) {
                cacaoCapsules -=1;
            }
            return true;
        }
        return false;
    }

    public void restockDrink(){
        coffeeCapsules = 200;
        milkCapsules = 150;
        cacaoCapsules = 50;
    }

    public String checkStocks(){
        return String.format("кофе - %d, молоко - %d, какао - %d", coffeeCapsules, milkCapsules, cacaoCapsules);
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        for (Drink dr: vending) {
            build.append(dr).append("\n");
        }
        return build.toString();
    }
}
