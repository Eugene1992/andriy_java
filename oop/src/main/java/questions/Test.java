package questions;

public class Test {
    public static void main(String[] args) {
//        Singletone singleton = new Singletone();

        Singletone instance1 = Singletone.getInstance();
        Singletone instance2 = Singletone.getInstance();
    }
}
