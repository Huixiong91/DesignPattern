package FactoryPattern;

public class WeaponFactory {

    public Weapon make(String weaponName){
        switch(weaponName) {
            case "Rifle" : return new Rifle();
            case "Grenade": return new Grenade();
            case "Missle": return new Missle();
            default: return null;
        }
    }
}
