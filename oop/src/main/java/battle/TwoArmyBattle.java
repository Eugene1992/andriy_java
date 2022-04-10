package battle;

public class TwoArmyBattle {
    private Army firstArmy;
    private Army secondArmy;

    public TwoArmyBattle(Army firstArmy, Army secondArmy) {
        this.firstArmy = firstArmy;
        this.secondArmy = secondArmy;
    }

    public void startFight() {
        while (!firstArmy.isAlive() || !secondArmy.isAlive()) {
            firstArmy.groupAttack(secondArmy);
            secondArmy.groupAttack(firstArmy);
        }

        if (firstArmy.isAlive()) {
            System.out.println(firstArmy.getName() + " won!");
        } else {
            System.out.println(secondArmy.getName() + " won!");
        }
    }
}
