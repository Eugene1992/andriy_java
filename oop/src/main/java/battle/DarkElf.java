package battle;


public class DarkElf extends Elf {
    public DarkElf(String name, int hp, int attack, int doubleAttackChange) {
        super(name, hp, attack, doubleAttackChange);
    }

    @Override
    void attack(Hero hero) {
        System.out.println("Attack from DarkElf");
    }

    void attackLikeDarkElf() {

    }
}
