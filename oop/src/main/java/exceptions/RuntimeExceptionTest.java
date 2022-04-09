package exceptions;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
//        Integer number = Integer.valueOf("dfdfd");
//        System.out.println(number);

//        System.out.println(10 / 0);

//      NPE
        Human human = null;

        try {
            human.say();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    static class Human {

        private String name;

        public void say() {
            System.out.println(name);
        }
    }
}
