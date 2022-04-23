package homeworks.list;

import java.util.Iterator;

public class SimpleArrays<E> implements Simple<E> {

    private E[] values;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;


    SimpleArrays() {
        values = (E[]) new Object[DEFAULT_CAPACITY];
    }


    @Override
    public void add(E element) {
        if (values.length == size) {
            Object[] newArray = new Object[values.length * 2];
            System.arraycopy(values, 0, newArray, 0, size);
            values = (E[]) newArray;
        }
        values[size++] = element;
    }

    @Override
    public void add(int index, E element) {
        if (index > 0) {

            for (int i = values.length; i > index; i--) {
                values[i] = values[i - 1];
            }
            values[index] = element;
        }
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < values.length; i++) {
            if (o.equals(values[i])) {
                for (int k = i; k < values.length - 1; k++) values[k] = values[k + 1];
                values[values.length] = null;

                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(int index) {
        if (index >= 0) {
            while (index < values.length - 1) {
                values[index] = values[index + 1];
                index++;
            }
        } else {
            System.out.println("This index is too small");
        }

    }

    @Override
    public E get(int index) {
        return (E) values[index];
    }

    @Override
    public void set(int index, E element) {
        try {
            values[index] = element;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("can`t set a word.. Index out of range. Position: " + e.getMessage());
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
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (values.equals(values[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;

    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < values.length; i++) {
                if (values[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < values.length; i++) {
                if (o.equals(values[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }

}
