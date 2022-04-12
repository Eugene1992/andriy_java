package examples;

public class Human {
    private String name;       // null
    private int age;           // 0
    private boolean isMarried; // false

    public Human(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    public void speak() {
    }

    void doSomething(int age) {

    }

    public static void main(String[] args) {
        Human human1 = new Human("Andriy", 18, false);
        Human human2 = new Human("Yevhen", 29, true);

        human1.sayHello();
        human2.sayHello();
    }
}
