package examples.scratch;

public abstract class AbstractList implements List {

    protected int size;
    protected int maxSize;

    public AbstractList(int maxSize) {
        this.maxSize = maxSize;
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(21);
    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }

    public abstract boolean add(Object object);

    public abstract void clear();
}
