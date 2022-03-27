import java.util.Random;

public class Ship extends Military{

        private int HoleChance;
    public Ship(String name, int hp, int attack, int armor, int missChance, int rotateChance) {
        super(name, hp, attack, armor, missChance, rotateChance);
        this.HoleChance = HoleChance;
    }

    @Override
    public void attack(Military military) {
            Random random = new Random();
            double chance = random.nextDouble() * 100;
            int totalAttack = attack;
            if (chance < HoleChance) {
                totalAttack = attack * 3;
            }
            military.hp = military.hp - totalAttack;
        }
    }


