package examples.inner_nested_classes;

public class InnerNestedTest {
    public void doSomething() {
        Car.Engine engine = new Car().new Engine();

        Car.Engine.Cylinder cylinder1 = new Car().new Engine().new Cylinder();

        Car car = new Car();
        Car.Engine engine2 = car.new Engine();
        Car.Engine.Cylinder cylinder2 = engine2.new Cylinder();

        String carName = engine2.getCarName();


        Car.Wheel wheel = new Car.Wheel();
    }
}
