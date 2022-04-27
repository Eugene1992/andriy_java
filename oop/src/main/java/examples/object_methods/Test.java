package examples.object_methods;

public class Test {
    public static void main(String[] args) {


        Home home = new Home();
        Cat catOne = new Cat("Fix", 2, true, home);
        System.out.println(catOne);
        Cat catTwo = new Cat("Fix", 2, true, home);

        System.out.println(catOne.hashCode());
        System.out.println(catTwo.hashCode());

        System.out.println(catOne.equals(catTwo));

        catOne = catTwo;

        System.out.println(catOne.equals(catTwo));
    }
}
