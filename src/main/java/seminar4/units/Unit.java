package seminar4.units;

import seminar4.weapons.Weapon;

import java.util.Random;

public abstract class Unit{
    protected String name;
    protected int healthPoint;
    protected Weapon weapon;

    public Unit(String name, int healthPoint, Weapon weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Unit setHealthPoint(int healsPoint) {
        this.healthPoint = healsPoint;
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

    public void reduceHealth(int damage){
        healthPoint -= damage;
        if (healthPoint < 0){
            healthPoint = 0;
        }
    }
    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d", name, weapon, healthPoint);
    }
}
