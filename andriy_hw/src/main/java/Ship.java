import java.util.Random;

public class Ship extends Military{

    private int holeChance;

    public Ship(String name, int hp, int attack, int armor, int missChance, int rotateChance) {
        super(name, hp, attack, armor, missChance, rotateChance);
        this.holeChance = holeChance;
    }

    @Override
    public void attack(Military military) {
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        int totalAttack = attack;
        if (chance < holeChance) {
            totalAttack = attack * 3;
        }
        military.hp = military.hp - totalAttack;
    }
}


