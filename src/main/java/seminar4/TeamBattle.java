package seminar4;


import seminar4.units.Unit;


public class TeamBattle<T extends Unit> {
    Team<T> reds;
    Team<T> greens;

    public TeamBattle(Team<T> reds, Team<T> greens) {
        this.reds = reds;
        this.greens = greens;
    }

    public void teamFight() {
        int damage;
        int def;
        int hit;

        while (reds.getTeamHealth() > 0 && greens.getTeamHealth() > 0) {
            for (Unit war1 : reds) {
                for (Unit war2 : greens) {
                    damage = war1.hit();
                    def = war2.def();
                    hit = damage > def ? damage - def : 0;
                    System.out.printf("%s hit %s -> %d\n", war1.getName(), war2.getName(), hit);
                    war2.reduceHealth(hit);

                    damage = war2.hit();
                    def = war1.def();
                    hit = damage > def ? damage - def : 0;
                    System.out.printf("%s hit %s -> %d\n", war2.getName(), war1.getName(), hit);
                    war1.reduceHealth(hit);

                }
                System.out.println();
            }
        }
        System.out.println(reds.getTeamHealth());
        System.out.println(greens.getTeamHealth());

        if (reds.getTeamHealth() > 0){
            System.out.println("Greens is DEAD!!!!");
        }else if (greens.getTeamHealth() > 0){
            System.out.println("Reds is DEAD!!!!");
        }else{
            System.out.println("THEY ARE ALL DEAD!!!");
        }

    }
}
