package homeworks.list;

import java.util.Iterator;
import java.util.Objects;

public class MyLinkedRealize<E> implements Simple<E> {
    static class Node<E> {
        E element;
        MyLinkedRealize.Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    private MyLinkedRealize.Node<E> first;
    private MyLinkedRealize.Node<E> last;
    private int size;

    @Override
    public void add(E element) {
        MyLinkedRealize.Node<E> newNode = new MyLinkedRealize.Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        Objects.checkIndex(index, size + 1);
        MyLinkedRealize.Node<E> newNode = new MyLinkedRealize.Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        } else {
            MyLinkedRealize.Node<E> current = first;
            for (int integer = 0; integer < index; integer++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public void remove(int index) {
        Objects.checkIndex(index, size + 1);
        if (index > 2) {
            MyLinkedRealize.Node<E> current = first;
            for (int integer = 0; integer < index; integer++) {
                current = current.next;
            }
        }
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E element) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}