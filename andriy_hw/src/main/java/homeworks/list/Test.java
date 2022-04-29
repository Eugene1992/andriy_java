package homeworks.list;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add(0,"1");
        list.add(1,"1");
        list.add(2,"3");
        list.remove("1");

        for (String listMy : list) {
            System.out.println(listMy);
        }
    }
}
