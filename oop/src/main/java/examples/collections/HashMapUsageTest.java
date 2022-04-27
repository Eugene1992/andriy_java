package examples.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapUsageTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        HashMap<Integer, Person> map = new HashMap<>();
        for (Person person : persons) {
            map.put(person.idCardNum, person);
        }

        /*while (true) {
            Person person = map.get(1212);
        }*/

        map.put(null, new Person());

    }

    public static Person getPersonByIdCardNum(List<Person> persons, Integer idCardNum) {
        for (Person person : persons) {
            if (person.idCardNum.equals(idCardNum)) {
                return person;
            }
        }

        return null;
    }


    static class Person {
        private String name;
        private Integer idCardNum;
    }
}
