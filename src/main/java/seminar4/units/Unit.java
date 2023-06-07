package seminar4.units;

import seminar4.defenth.Armor;
import seminar4.weapons.Weapon;

import java.util.Random;

public abstract class Unit{
    protected String name;
    protected int healthPoint;
    protected Weapon weapon;
    protected Armor armor;

    public Unit(String name, int healthPoint, Weapon weapon, Armor armor) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armor = armor;
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

    public int hit(){
        Random random = new Random();
        return random.nextInt(0, weapon.damage()+1);
    }
    public int def(){
        return armor.defense();
    }

    public void reduceHealth(int damage){
        healthPoint -= damage;
        if (healthPoint < 0){
            healthPoint = 0;
        }
    }
    @Override
    public String toString() {
        return String.format("Name: %s, HealthPoint: %d, Weapon: %s, Armor: %s", name, healthPoint, weapon, armor);
    }
}
