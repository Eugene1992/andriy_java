package homeworks.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        ArrayList<String> listLink = new ArrayList<>();
        listLink.add(0,"25");

        listLink.remove("25");

        for (String listMy : listLink) {
            System.out.println(listMy);
        }
    }
}
