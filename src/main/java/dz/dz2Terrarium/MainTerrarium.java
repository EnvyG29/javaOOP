package dz.dz2Terrarium;


import dz.dz2Terrarium.fauna.*;
import dz.dz2Terrarium.skills.IsPoisonous;
import dz.dz2Terrarium.skills.SwimSpeed;

public class MainTerrarium {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addFosterling(new Spider("Скакун", 1))
                .addFosterling(new Snake("Ленточная", 3))
                .addFosterling(new Salamander("Родниковая", 2))
                .addFosterling(new Frog("Ужасный листолаз", 2))
                .addFosterling(new Scincus("Крокодиловый", 1));
        System.out.println(terrarium);

        System.out.println("\nЯдовитые");
        for (IsPoisonous fosterling: terrarium.poisonous()) {
            System.out.println(fosterling);
        }

        System.out.println("\nСамый быстрый в воде");
        System.out.println(terrarium.getSwimFaster());


    }
}
