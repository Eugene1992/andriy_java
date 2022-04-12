package examples.battle;


import java.util.Random;

public class DarkElf extends Elf {

    private int doubleAttackChance;

    public DarkElf(String name, int hp, int attack, int doubleAttackChange) {
        super(name, hp, attack);
        this.doubleAttackChance = doubleAttackChange;
    }

    void attackLikeDarkElf() {

    }

    @Override
    void attack(Hero hero) {
        System.out.println("Attack from Elf class");
        Random random = new Random();
        double chance = random.nextDouble() * 100;
        int totalAttack = attack;
        if (chance < doubleAttackChance) {
            totalAttack = attack * 2;
        }
        hero.hp = hero.hp - totalAttack;
    }

    @Override
    void specialAttack() {

    }

    @Override
    public void doubleBonusAttack() {

    }
}
