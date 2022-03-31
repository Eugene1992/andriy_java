import java.util.Random;

public abstract class Military {

    protected String name;
    protected int hp;
    protected int attack;
    protected int armor;
    protected int missChance;
    protected int rotateChance;

    public Military(String name, int hp, int attack, int armor, int missChance, int rotateChance) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.armor = armor;
        this.missChance = missChance;
        this.rotateChance = rotateChance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMissChance() {
        return missChance;
    }

    public void setMissChance(int missChance) {
        this.missChance = missChance;
    }

    public int getRotateChance() {
        return rotateChance;
    }

    public void setRotateChance(int rotateChance) {
        this.rotateChance = rotateChance;
    }
    
    public void attack(Military enemy) {
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
        return hp>0;
    }
}
