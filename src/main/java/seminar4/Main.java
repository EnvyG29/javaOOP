package seminar4;


import seminar4.defenth.Leather;
import seminar4.defenth.Mail;
import seminar4.defenth.Plate;
import seminar4.units.Archer;
import seminar4.units.Infantryman;
import seminar4.units.Unit;
import seminar4.weapons.meleeWeapon.Axe;
import seminar4.weapons.meleeWeapon.Sword;
import seminar4.weapons.rangeWeapon.Bow;
import seminar4.weapons.rangeWeapon.Crossbow;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Team<Unit> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new Leather()));
        team1.add(new Infantryman("John", 150, new Axe(), new Mail()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new Crossbow(), new Mail()));
        teamArchers.add(new Archer("Piter", 100, new Bow(), new Leather()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new Plate()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);

        Duel duel1 = new Duel(new Infantryman("John", 150, new Axe(), new Mail()), (new Archer("Robin", 100, new Bow(), new Leather())));
        System.out.println("-----------");
        duel1.fight();
        Iterator<Archer> tA = teamArchers.iterator();
        Duel duel2 = new Duel(tA.next(), tA.next());
        System.out.println("-----------");
        duel2.fight();

        Team<Archer> reds = new Team<>();
        reds.add(new Archer("Arch 1", 100, new Bow(), new Leather()));
        reds.add(new Archer("Arch 2", 100, new Bow(), new Leather()));
        reds.add(new Archer("Arch 3", 100, new Bow(), new Leather()));
        reds.add(new Archer("Arch 4", 100, new Bow(), new Leather()));
        reds.add(new Archer("Arch 5", 100, new Bow(), new Leather()));
        reds.add(new Archer("Crossbows 6", 100, new Crossbow(), new Mail()));
        reds.add(new Archer("Crossbows 7", 100, new Crossbow(), new Mail()));
        reds.add(new Archer("Crossbows 8", 100, new Crossbow(), new Mail()));

        Team<Archer> greens = new Team<>();
        greens.add(new Archer("Crossbows A", 100, new Crossbow(), new Mail()));
        greens.add(new Archer("Crossbows B", 100, new Crossbow(), new Mail()));
        greens.add(new Archer("Crossbows C", 100, new Crossbow(), new Mail()));
        greens.add(new Archer("Arch D", 100, new Bow(), new Leather()));
        greens.add(new Archer("Arch E", 100, new Bow(), new Leather()));
        greens.add(new Archer("Arch F", 100, new Bow(), new Leather()));
        greens.add(new Archer("Arch G", 100, new Bow(), new Leather()));
        greens.add(new Archer("Arch H", 100, new Bow(), new Leather()));

        System.out.println("\nСтенка на стенку");
        TeamBattle<Archer> teamBattle = new TeamBattle<>(reds, greens);
        teamBattle.teamFight();

    }
}
