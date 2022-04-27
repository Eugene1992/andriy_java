package examples.object_methods;

public class Cat {

    private String name;
    private int age;
    private boolean isHome;
    private Home home;

    public Cat(String name, int age, boolean isHome, Home home) {
        this.name = name;
        this.age = age;
        this.isHome = isHome;
        this.home = home;
    }

    @Override
    public boolean equals(Object anotherCat) {
        if (this == anotherCat) {
            return true;
        }
        if (anotherCat == null || getClass() != anotherCat.getClass()) {
            return false;
        }

        Cat cat = (Cat) anotherCat;

        if (age != cat.age) {
            return false;
        }
        if (isHome != cat.isHome) {
            return false;
        }
        if (!name.equals(cat.name)) {
            return false;
        }
        if (home != null) {
            return home.equals(cat.home);
        } else {
            return cat.home == null;
        }
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + (isHome ? 1 : 0);
        result = 31 * result + (home != null ? home.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
