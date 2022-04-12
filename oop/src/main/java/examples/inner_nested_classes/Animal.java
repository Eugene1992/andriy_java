package examples.inner_nested_classes;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Some noise");
    }
}
