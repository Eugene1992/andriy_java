package battle;

import java.util.ArrayList;

public class Army {



    // varargs
    public void groupAttack(Hero enemy, Hero... squad) {
        for (Hero hero : squad) {
            hero.attack(enemy);
        }
    }

    // varargs
    public void groupAttack(Hero enemy, Human human, Elf elf, Dwrarf dwrarf) {
        human.attack(enemy);
        elf.attack(enemy);
        dwrarf.attack(enemy);
    }
}
