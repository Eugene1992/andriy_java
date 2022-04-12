package homeworks;

import java.util.Random;

public class Plane extends Military {

    private int nuclearWeapon;

    public Plane(String name, int hp, int attack, int armor, int missChance, int nuclearWeapon) {
        super(name, hp, attack, armor, missChance);
        this.nuclearWeapon = nuclearWeapon;
    }

    @Override
    public void attack(Military military) {
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        int chanceMiss = (int) (random.nextDouble() * 100);
        int totalAttack;
        if (chanceMiss > missChance) {
            if (chance > nuclearWeapon) {
                totalAttack = this.attack * 5;
                System.out.println("plane got angry :)");
            } else {
                totalAttack = this.attack - this.armor;
            }
            military.hp = military.hp - totalAttack;
            System.out.println(this.name + " hit for " + totalAttack);
        } else {
            System.out.println(name + " is missed!");
        }
    }
}
