package seminar4;

import seminar4.units.Unit;
import seminar4.weapons.Weapon;

public class Battle {
    private Unit w1;
    private Unit w2;

    public Battle(Unit w1, Unit w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0){
            int damage1 = w1.hit();
            System.out.println("first hit second : " + damage1);
            w2.reduceHealth(damage1);
            int damage2 = w2.hit();
            System.out.println("second hit first : " + damage2);
            w1.reduceHealth(damage2);
            System.out.println(w1);
            System.out.println(w2);
        }
    }
}