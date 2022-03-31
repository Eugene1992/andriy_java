package battle;

public abstract class Elf extends Hero {

    protected int attackBonus;

    public Elf(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    public abstract void doubleBonusAttack();
}
