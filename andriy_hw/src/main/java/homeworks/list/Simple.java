package homeworks.list;

public interface Simple<E> extends/*наслідує */ Iterable<E> // щоб працювати з аррайліст
{
    void add(E element);

    void add(int index, E element);

    boolean remove(Object o);

    void remove(int index);

    E get(int index);

    void set(int index, E element);

    int size();

    boolean isEmpty();

    void clear();

    boolean contains(E e);

    int indexOf(Object o);
}
