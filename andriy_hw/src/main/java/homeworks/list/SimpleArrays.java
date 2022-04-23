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

            for (int integer = values.length; integer > index; integer--) {
                values[integer] = values[integer - 1];
            }
            values[index] = element;
        }
    }

    @Override
    public boolean remove(Object object) {
        for (int integer = 0; integer < values.length; integer++) {
            if (object.equals(values[integer])) {
                for (int temp = integer; temp < values.length - 1; temp++) {
                    values[temp] = values[temp + 1];
                    values[values.length] = null;
                }
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
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }

}
