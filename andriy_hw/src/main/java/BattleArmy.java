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
                System.out.println("attack first");
            armySecond.groupAttack(armyFirst);
                System.out.println("attack second");
        }
        if(armyFirst.isAlive() && !armySecond.isAlive()) {
            System.out.println("first win");
        } else {
            System.out.println("second win");
        }
    }

}
