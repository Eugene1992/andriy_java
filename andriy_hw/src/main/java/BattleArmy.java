public class BattleArmy {

    private Army armyFirst;
    private Army armySecond;

    public BattleArmy(Army armyFirst, Army armySecond) {
        this.armyFirst = armyFirst;
        this.armySecond = armySecond;
    }

    public void fightReady() {
        while (armyFirst.isAlive() && armySecond.isAlive()) {
            armyFirst.groupAttack(armySecond);
            armySecond.groupAttack(armyFirst);
            System.out.println("FA: " + armyFirst.getSquad().size());
            System.out.println("SA: " + armySecond.getSquad().size());
        }

        if (armyFirst.isAlive() && !armySecond.isAlive()) {
            System.out.println("first win");
        } else {
            System.out.println("second win");
        }
    }
}
