import java.util.Random;

public class Plane extends Military {

    private int nuclearWeapon;

    public Plane(String name, int hp, int attack, int armor, int missChance, int rotateChance) {
        super(name, hp, attack, armor, missChance, rotateChance);
        this.nuclearWeapon = nuclearWeapon;
    }

    @Override
    public void attack(Military military) {
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        int totalAttack = attack;
        if (chance < nuclearWeapon) {
            totalAttack = attack * 10;
        }
        military.hp = military.hp - totalAttack;
    }
}
