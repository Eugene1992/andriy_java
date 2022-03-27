import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Military ork = new Infantry("Ork",50,3,20,20,5);
        Military zsu = new Infantry("zsu",100,7,40,5,25);
        Military ghostKyiv = new Plane("ghostKyiv", 320,180,1000,5,70);
        Military sheherizada = new Ship("sheherizada", 500, 150,1000,25,20);
        Military orcomobile = new Tank("orkomodile", 1000, 100,1200,15,5);

        ArrayList<Military> ukraineSquad = new ArrayList<>();
        ukraineSquad.add(zsu);
        ukraineSquad.add(ghostKyiv);

        Army ukraine = new Army(ukraineSquad);

        ArrayList<Military> orkSquad = new ArrayList<>();
        orkSquad.add(orcomobile);
        orkSquad.add(sheherizada);
        orkSquad.add(ork);

        Army rusnya = new Army(orkSquad);

        BattleArmy battle = new BattleArmy(ukraine,rusnya);
        battle.fightReady();

    }
}
