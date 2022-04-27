package homeworks.list;

import java.util.Iterator;

public class MyLinkedRealize<E> implements MyMethod<E> {
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int startIndex = 0;

            @Override
            public boolean hasNext() {
                return startIndex < size;
            }

            @Override
            public E next() {
                return getNodeByIndex(startIndex++).element;
            }
        };
    }

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
        checkIndex(index, size + 1);
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
            Node<E> prev = getNodeByIndex(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    private Node<E> getNodeByIndex(int index) {
        MyLinkedRealize.Node<E> current = first;
        for (int integer = 0; integer < index; integer++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public boolean remove(Object object) {
        MyLinkedRealize.Node<E> current = first;
        for (int index = 0; index <= size; index++) {
            E removeElement;
            if (object.equals(current)) {
                if (index == size - 1) {
                    last = getNodeByIndex(index - 1);
                } else {
                    removeByIndex(index);
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public E remove(int index) {
        checkIndex(index, size + 1);
        E removeElement = removeByIndex(index);
        size--;
        return removeElement;
    }

    public void checkIndex(int index, int size) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public E removeByIndex(int index) {
        E removeElement;
        if (index == 0) {
            removeElement = first.element;
            first = first.next;
        } else {
            Node<E> prev = getNodeByIndex(index - 1);
            removeElement = prev.next.element;
            prev.next = prev.next.next;
        }
        return removeElement;
    }

    @Override
    public E get(int index) {
        checkIndex(index, size);
        return getNodeByIndex(index).element;
    }

    @Override
    public void set(int index, E element) {
        checkIndex(index, size);
        Node<E> node = getNodeByIndex(index);
        node.element = element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public boolean contains(E element) {
        Node<E> current = first;
        for (int integer = 0; integer < size; integer++) {
            if (current.element.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int indexOf(Object object) {
        MyLinkedRealize.Node<E> current = first;
        for (int integer = 0; integer < size; integer++) {
            if (current.equals(object)) {
                return integer;
            } else {
                current = current.next;
            }
        }
        return -1;
    }

}