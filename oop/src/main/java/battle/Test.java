package battle;

import battle.Human;

public class Test {
    public static void main(String[] args) {
        Hero tom = new Elf("Tom", 100, 30, 30);
        Hero arnold = new Dwrarf("Arnold", 300, 40, 5);
        Hero vladimir = new Human("Vladimir", 200, 25);

        Elf sara = new Elf("Sara", 200, 20, 10);

        tom.attack(sara);
        arnold.attack(sara);
        vladimir.attack(sara);

        Army army = new Army();
        Hero[] squad = {tom, arnold, vladimir};

        Hero bill = new Elf("Bill", 100, 30, 30);

        army.groupAttack(sara, tom, arnold, vladimir, bill);

        army.groupAttack(sara, tom, arnold, vladimir);

        Hero darkElf = new DarkElf("Winston", 100, 30, 30);
        Elf darkElff = new DarkElf("Winston", 100, 30, 30);
        DarkElf darkElfff = new DarkElf("Winston", 100, 30, 30);

        // type cast
        DarkElf castedHero = (DarkElf) darkElf;

        doSomething(castedHero);
    }

    static void doSomething(Elf someElf) {
        System.out.println("Do something");
    }
}
