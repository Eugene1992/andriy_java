package homeworks.list;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private Object[] values;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    MyArrayList() {
        values = new Object[DEFAULT_CAPACITY];
    }

    private void resize() {
        if (values.length == size) {
            Object[] newArray = new Object[values.length * 2];
            System.arraycopy(values, 0, newArray, 0, size);
            values = newArray;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void add(E element) {
        resize();
        values[size] = element;
        size++;
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index - 1);
        resize();
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = element;
        size++;
    }

    @Override
    public boolean remove(Object object) {
        for (int integer = 0; integer < values.length; integer++) {
            if (object.equals(values[integer])) {
                for (int temp = integer; temp < values.length - 1; temp++) {
                    values[temp] = values[temp + 1];
                    size--;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        checkIndex(index);
        E removedElement = (E) values[index];
        System.arraycopy(values, index + 1, values, index, values.length - index - 1);
        size--;
        return removedElement;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) values[index];
    }

    @Override
    public void set(int index, E element) {
        try {
            values[index] = element;
        } catch (IndexOutOfBoundsException elementCatch) {
            System.out.println("can`t set a word.. Index out of range. Position: " + elementCatch.getMessage());
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        for (int integer = 0; integer < size; integer++) {
            if (values.equals(values[integer])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        values = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int indexOf(Object object) {
        if (object == null) {
            for (int integer = 0; integer < values.length; integer++) {
                if (values[integer] == null) {
                    return integer;
                }
            }
        } else {
            for (int integer = 0; integer < values.length; integer++) {
                if (object.equals(values[integer])) {
                    return integer;
                }
            }
        }
        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Iterator<E> iterator() {
        return new ArrayIterator<>((E[]) values);
    }

    public static class NodeIterator<E> implements Iterator<E> {
        private int index = 0;
        private E[] values;

        @Override
        public boolean hasNext() {
            return index < values.length;
        }

        @Override
        public E next() {
            return values[index++];
        }
    }
}
