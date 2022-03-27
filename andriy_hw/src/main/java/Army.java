import java.util.ArrayList;
import java.util.Random;

public class Army {

    private ArrayList<Military> squad;



  /* public void groupAttack(Army enemy) {
        for (Military military : squad) {
            Military enemyMilitary = enemy.getRandomMilitary();
            enemyMilitary.attack(enemyMilitary);
        }
    }*/


    /*public Military getRandomMilitary() {
        Random rand = new Random(squad.size());
        int militaryIndex = rand.nextInt();
        return squad.get(militaryIndex);
    }*/

    public Military getRandomRotate() {
        Random random = new Random();
        int randomRotate = random.nextInt();

        return null;
    }

    boolean isAlive() {
        return squad.isEmpty();
    }
}

