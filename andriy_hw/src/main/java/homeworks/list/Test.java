package homeworks.list;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        LinkedList<String> listLink = new LinkedList<>();
        list.add(0,"2");
        list.add(1,"1");
        list.add(2,"3");
        list.add(3,"1");
        list.add(4,"7");

        list.remove("3");

        for (String listMy : list) {
            System.out.println(listMy);
        }
    }
}
