package homeworks.list;

public class Test {
    public static void main(String[] args) {
        Simple<String> myList = new SimpleArrays<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");

        for (String s : myList) {
            System.out.println(s);
        }
    }
}
