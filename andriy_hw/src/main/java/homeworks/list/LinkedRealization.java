package homeworks.list;

import java.util.Iterator;
import java.util.Objects;

public class LinkedRealization<E> implements Simple<E> {
    static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
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
        Objects.checkIndex(index,size+1);
        Node<E> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        }else{
            Node<E> current = first;
            for (int i = 0; i<index;i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void remove(int index) {
        Objects.checkIndex(index,size+1);
        if
        Node<E> current = first;
        for (int i = 0; i<index;i++){
            current = current.next;
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
    public boolean contains(E e) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
