package seminar4.units;

import seminar4.weapons.Weapon;

import java.util.Random;

public abstract class Unit{
    protected String name;
    protected int healsPoint;
    protected Weapon weapon;

    public Unit(String name, int healsPoint, Weapon weapon) {
        this.name = name;
        this.healsPoint = healsPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealsPoint() {
        return healsPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Unit setHealsPoint(int healsPoint) {
        this.healsPoint = healsPoint;
        return this;
    }

    public Unit setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public int hit(){
        Random random = new Random();
        return random.nextInt(0, weapon.damage()+1);

    }

    public void rediceHealth(int damage){
        healsPoint -= damage;
        if (healsPoint < 0){
            healsPoint = 0;
        }
    }
}
