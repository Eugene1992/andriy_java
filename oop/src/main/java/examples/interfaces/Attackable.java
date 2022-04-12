package examples.interfaces;

public interface Attackable {

    int MAX_ATTACK = 100;

    // before Java 8
    int attack(Hero enemy);

    boolean isAlive();
}
