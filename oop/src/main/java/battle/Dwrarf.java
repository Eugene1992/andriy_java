package battle;

import java.util.Random;

public class Dwrarf extends Hero {

    private int blockAttackChance;

    public Dwrarf(String name, int hp, int attack, int blockAttackChance) {
        super(name, hp, attack);
        this.blockAttackChance = blockAttackChance;
    }

    @Override
    void attack(Hero hero) {
        System.out.println("Attack from Dwrarf class");
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        if (!(chance < blockAttackChance)) {
            hero.hp = hero.hp - attack;
        }
    }

    @Override
    void specialAttack() {

    }
}
