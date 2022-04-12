package examples.battle;

import java.util.ArrayList;
import java.util.Random;

public class Army {

    private String name;
    private ArrayList<Hero> squad;

    public Army(String name, ArrayList<Hero> squad) {
        this.name = name;
        this.squad = squad;
    }

    public String getName() {
        return name;
    }

    public void groupAttack(Army enemyArmy) {
        for (Hero hero : squad) {
            Hero enemyHero = enemyArmy.getRandomHero();
            hero.attack(enemyHero);

            if (!enemyHero.isAlive()) {
                enemyArmy.squad.remove(enemyHero);
            }
        }
    }

    public Hero getRandomHero() {
        Random random = new Random(squad.size());
        int heroIndex = random.nextInt();

        return squad.get(heroIndex);
    }

    public boolean isAlive() {
        return !squad.isEmpty();
    }
}
