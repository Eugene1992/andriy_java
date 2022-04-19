package homeworks.hgf;

import java.util.ArrayList;
import java.util.List;

public class Test {

    static void allAnimalStatic(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.say();
            }
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.say();
            }
            if (animal instanceof Frog) {
                Frog frog = (Frog) animal;
                frog.say();
            }
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal frog = new Frog();
        animals.add(cat);
        animals.add(dog);
        animals.add(frog);

        // non static method call
        Test test = new Test();
        test.allAnimal(animals);

        // static method call
        Test.allAnimalStatic(animals);
    }

    void allAnimal(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.say();
        }
    }

}
