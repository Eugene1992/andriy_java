package homeworks;

import java.util.ArrayList;

public class Army {

    private ArrayList<Military> squad;

    public Army(ArrayList<Military> squad) {
        this.squad = squad;
    }

    public void groupAttack(Army enemyArmy) {
        for (Military military : squad) {
            Military enemyMilitary = enemyArmy.getRandomMilitary();
            military.attack(enemyMilitary);

        }
    }

    public Military getRandomMilitary() {
        int max = squad.size();
        int militaryIndex = (int) (Math.random() * max);
        Military military = null;
        try {
            military = squad.get(militaryIndex);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return military;
    }

    boolean isAlive() {
        return !squad.isEmpty();
    }

    public ArrayList<Military> getSquad() {
        return squad;
    }
}

