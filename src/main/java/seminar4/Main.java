package seminar4;

import seminar4.units.Archer;
import seminar4.units.Infantryman;
import seminar4.units.Unit;
import seminar4.weapons.meleeWeapon.Axe;
import seminar4.weapons.meleeWeapon.Sword;
import seminar4.weapons.rangeWeapon.Bow;
import seminar4.weapons.rangeWeapon.Crossbow;

public class Main {
    public static void main(String[] args) {
        Team<Unit> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow()));
        team1.add(new Infantryman("John", 150, new Axe()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new Crossbow()));
        teamArchers.add(new Archer("Piter", 100, new Bow()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);

        Battle battle1 = new Battle(new Infantryman("John", 150, new Axe()), (new Archer("Robin", 100, new Bow())));

        battle1.fight();

    }
}
