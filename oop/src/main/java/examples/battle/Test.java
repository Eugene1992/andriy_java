package examples.battle;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Hero tom = new DarkElf("Tom", 100, 30, 30);
        Hero arnold = new Dwrarf("Arnold", 300, 40, 5);
        Hero vladimir = new Human("Vladimir", 200, 25);

        ArrayList<Hero> ukraineArmySquad = new ArrayList<>();
        ukraineArmySquad.add(tom);
        ukraineArmySquad.add(arnold);
        ukraineArmySquad.add(vladimir);

        Army ukraine = new Army("Ukraine", ukraineArmySquad);

        Hero vanya1 = new Human("Vanya 1", 50, 10);
        Hero vanya2 = new Human("Vanya 1", 50, 10);
        Hero vanya3 = new Human("Vanya 1", 50, 10);

        ArrayList<Hero> rusnyaArmySquad = new ArrayList<>();
        rusnyaArmySquad.add(vanya1);
        rusnyaArmySquad.add(vanya2);
        rusnyaArmySquad.add(vanya3);

        Army rusnya = new Army("Rusnya", rusnyaArmySquad);

        TwoArmyBattle battle = new TwoArmyBattle(ukraine, rusnya);
        battle.startFight();
    }

    static void doSomething(Elf someElf) {
        System.out.println("Do something");
    }
}
