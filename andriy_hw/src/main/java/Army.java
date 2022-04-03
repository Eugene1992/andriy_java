import java.util.ArrayList;

public class Army {

    private ArrayList<Military> squad;

    public Army(ArrayList<Military> squad) {
        this.squad = squad;
    }

    public void groupAttack(Army enemyArmy) {
        for (Military military  : squad) {
            Military enemyMilitary = enemyArmy.getRandomMilitary();
            military.attack(enemyMilitary);

            if(!enemyMilitary.isAlive()) {
                enemyArmy.squad.remove(enemyMilitary);
            }
        }
    }

    public Military getRandomMilitary() {
        int max = squad.size();
        int militaryIndex = (int) (Math.random() * max);
        Military military = null;
        try {
            military = squad.get(militaryIndex);
        } catch (Exception e) {
            e.printStackTrace();
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

