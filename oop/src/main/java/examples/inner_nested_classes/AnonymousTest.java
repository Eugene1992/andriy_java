package examples.inner_nested_classes;

public class AnonymousTest {
    public static void main(String[] args) {

        Animal dog = new class LocalClass extends Cat implements Cloneable {

            public LocalClass(String name) {
                super(name);
            }
        }
        ;

        dog.say();

        Animal("Rex") {
            public String nickname;

            @Override
            public void say () {
                System.out.println("Woof");
            }

            public void setNickname (String nickname){
                this.nickname = nickname;
            }
        }

        LocalClass localClass = new LocalClass("dsds");
    }

    public void doSomething() {
    }

}
