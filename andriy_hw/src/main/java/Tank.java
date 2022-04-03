import java.util.Random;

public class Tank extends Military {

    private int stuck;

    public Tank(String name, int hp, int attack, int armor, int missChance, int stuck) {
        super(name, hp, attack, armor, missChance);
        this.stuck = stuck;
    }

    @Override
    public void attack(Military military) {
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        int chanceMiss = (int) (random.nextDouble() * 100);
        int totalAttack;
        if (chanceMiss > missChance) {
            if (chance > stuck) {
                System.out.println("tank stucked :)");
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


