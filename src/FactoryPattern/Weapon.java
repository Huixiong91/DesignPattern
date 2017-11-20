package FactoryPattern;

public abstract class Weapon {

    String name;
    int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dealDamage() {
        System.out.println(getName() + " dealing " + getDamage() + " damage");
    }
}
