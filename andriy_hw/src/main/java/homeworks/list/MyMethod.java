package homeworks.list;

public interface MyMethod<E> extends Iterable<E> {
    void add(E element);

    void add(int index, E element);

    boolean remove(Object object);

    E remove(int index);

    E get(int index);

    void set(int index, E element);

    int size();

    boolean isEmpty();

    void clear();

    boolean contains(E element);

    int indexOf(Object object);
}
