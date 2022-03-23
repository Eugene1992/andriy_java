package battle;

import java.util.Random;

public class Elf extends Hero {

    private int doubleAttackChance;

    public Elf(String name, int hp, int attack, int doubleAttackChange) {
        super(name, hp, attack);
        this.doubleAttackChance = doubleAttackChange;
    }

    public int getDoubleAttackChance() {
        return doubleAttackChance;
    }

    public void setDoubleAttackChance(int doubleAttackChance) {
        this.doubleAttackChance = doubleAttackChance;
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
}
