import java.util.Random;

public class Infantry extends Military {

    private int upgreidWeapon;

    public Infantry(String name, int hp, int attack, int armor, int missChance, int rotateChance) {
        super(name, hp, attack, armor, missChance, rotateChance);
        this.upgreidWeapon = upgreidWeapon;
    }

    @Override
    public void attack(Military military) {
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        int totalAttack = attack;
        if (chance < upgreidWeapon) {
            totalAttack = attack * 3;
        }
        military.hp = military.hp - totalAttack;
        }
}

