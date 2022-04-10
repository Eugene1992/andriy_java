package questions;

public class Human {

    private String name;
    private int age;
    private int salary;
    private String address;

    public Human(int salary, String name) {
        this(name, 0, salary, null);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Human(String name, String address) {
        this.name = name;
        this.address = address;
    }


    private Human(String name, int age, int salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }
}
