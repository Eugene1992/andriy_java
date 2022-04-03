import java.util.Random;

public class Infantry extends Military {

    private int upgreidWeapon;

    public Infantry(String name, int hp, int attack, int armor, int missChance, int upgreidWeapon) {
        super(name, hp, attack, armor, missChance);
        this.upgreidWeapon = upgreidWeapon;
    }

    @Override
    public void attack(Military military) {
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        int chanceMiss = (int) (random.nextDouble() * 100);
        int totalAttack;
        if (chanceMiss > missChance) {
            if (chance > upgreidWeapon) {
                totalAttack = this.attack * 3;
                System.out.println("opa, ya dovolniy :)");
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

