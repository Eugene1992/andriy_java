import java.util.Random;

public class Tank extends Military {

    private int stuck;

    public Tank(String name, int hp, int attack, int armor, int missChance, int rotateChance) {
        super(name, hp, attack, armor, missChance, rotateChance);
        this.stuck = stuck;
    }

    @Override
    public void attack(Military military) {
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        int totalAttack = attack;
        if (chance < stuck) {
            totalAttack = attack * 0;
        }
        military.hp = military.hp - totalAttack;
    }
}

