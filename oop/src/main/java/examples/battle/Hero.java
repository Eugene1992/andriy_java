package examples.battle;

public abstract class Hero {
    protected String name;
    protected int hp;
    protected int attack;

    public Hero(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void attack(Hero hero) {
        System.out.println("Attack from Hero class");
        hero.hp = hero.hp - attack;
    }

    abstract void specialAttack();

    public boolean isAlive() {
        return hp > 0;
    }
}
