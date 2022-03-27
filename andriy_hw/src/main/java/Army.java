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
        Random rand = new Random(squad.size());
        int militaryIndex = rand.nextInt();
        return squad.get(militaryIndex);
    }

  /*  public Military getRandomRotate() {
        Random random = new Random();
        int randomRotate = random.nextInt();

       return randomRotate;
    }*/

    boolean isAlive() {
        return squad.isEmpty();
    }
}

