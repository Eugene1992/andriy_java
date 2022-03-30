import java.util.ArrayList;
import java.util.Random;

public class Army {

    private ArrayList<Military> squad;

    public Army(ArrayList<Military> squad) {
        this.squad = squad;
    }
        //групова атака
    public void groupAttack(Army enemyArmy) {
        for (Military military  : squad) {
            Military enemyMilitary = enemyArmy.getRandomMilitary();
            enemyMilitary.attack(enemyMilitary);

            if(enemyMilitary.isAlive()){
                enemyArmy.squad.remove(enemyMilitary);
            }
        }
    }
        //рандомна аката
    public Military getRandomMilitary() {
        Random rand = new Random();
        int max = squad.size();
        int militaryIndex = (int) (Math.random() * max);
        return squad.get(militaryIndex);
    }


    boolean isAlive() {
        return squad.isEmpty();
    }
}

