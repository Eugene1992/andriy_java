package battle;

import java.util.Random;

// private
// public
// protected
// default | package-private

public class Warrior {
    private String name;
    private int hp;
    private int attack;
    private int armor;
    private int missChance;

    static final int MINIMUM_HP = 500;

    public Warrior(String name, int hp, int attack, int armor, int missChance) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.armor = armor;
        this.missChance = missChance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMissChance() {
        return missChance;
    }

    public void setMissChance(int missChance) {
        if (missChance > 0) {
            this.missChance = missChance;
        } else {
            System.out.println("Invalid miss chance value, should be greater than zero");
        }
    }

    static void showMinimumHp() {
        System.out.println(MINIMUM_HP);
    }

    void setHp(int hp) {
        if (hp < MINIMUM_HP) {
            System.out.println("Invalid hp value, should be more than 500");
        } else {
            this.hp = hp;
        }
    }

    public void attack(Warrior enemy) {
        Random random = new Random();
        int chance = (int) (random.nextDouble() * 100);
        if (chance > missChance) {
            int damage = this.attack - this.armor;
            enemy.hp = enemy.hp - damage;
            System.out.println(this.name + " hit for " + damage);
        } else {
            System.out.println(name + " is missed!");
        }
    }

    boolean isAlive() {
        return hp > 0;
    }
}

