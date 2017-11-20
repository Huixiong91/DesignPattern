package FactoryPattern;

import java.util.Scanner;

public class Warzone {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new WeaponFactory();
        Weapon theWeapon = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What type of Weapon? (Rifle / Grenade / Missle)");

        if (scanner.hasNextLine()){
            String typeOfWeapon = scanner.nextLine();
            theWeapon = weaponFactory.make(typeOfWeapon);
            if(theWeapon != null){
                theWeapon.dealDamage();
            } else System.out.print("Please enter (Rifle / Grenade) next time.");
        }
    }
}
