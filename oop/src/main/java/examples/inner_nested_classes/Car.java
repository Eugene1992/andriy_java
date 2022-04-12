package examples.inner_nested_classes;

public class Car {

    private String name;

    // nested class
    static class Wheel {

    }

    // inner class
    public class Engine {

        private int volume;

        public String getCarName() {
            return name;
        }

        public class Cylinder {

        }
    }
}
