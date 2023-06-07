package seminar4;

import seminar4.units.Unit;

public class Duel {
    private final Unit w1;
    private final Unit w2;

    public Duel(Unit w1, Unit w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        int damage;
        int def;
        int hit;
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0){
//            атака первого
            damage = w1.hit();
            def = w2.def();
            hit = damage > def ? damage - def : 0;
            System.out.printf("%s hit %s -> %d\n",w1.getName(), w2.getName(), hit);
            w2.reduceHealth(hit);
//            атака второго
            damage = w2.hit();
            def = w1.def();
            hit = damage > def ? damage - def : 0;
            System.out.printf("%s hit %s -> %d\n",w2.getName(), w1.getName(),hit);
            w1.reduceHealth(hit);


            System.out.println(w1);
            System.out.println(w2);
        }
        if (w1.getHealthPoint() > 0){
            System.out.println(w1.getName() + " is DEAD!!!!");
        } else {
            System.out.println(w2.getName() + " is DEAD!!!!");
        }
    }
}