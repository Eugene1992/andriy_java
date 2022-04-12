package homeworks;

import java.util.Random;

public class Ship extends Military {

    private int holeChance;

    public Ship(String name, int hp, int attack, int armor, int missChance, int holeChance) {
        super(name, hp, attack, armor, missChance);
        this.holeChance = holeChance;
    }

    @Override
    public void attack(Military military) {
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        int chanceMiss = (int) (random.nextDouble() * 100);
        int totalAttack;
        if (chanceMiss > missChance) {
            if (chance > holeChance) {
                System.out.println("ship stucked :)");
                military.hp = -1;
            } else {
                totalAttack = this.attack - this.armor;
                military.hp = military.hp - totalAttack;
                System.out.println(this.name + " hit for " + totalAttack);
            }
        } else {
            System.out.println(name + " is missed!");
        }
    }
}


