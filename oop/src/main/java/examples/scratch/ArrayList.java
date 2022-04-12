package examples.scratch;

class ArrayList extends AbstractList
        implements List {

    public ArrayList(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean add(Object object) {
        // logic

        size++;
        return false;
    }

    @Override
    public void clear() {

    }
}

class LinkedList extends AbstractList
        implements List {

    public LinkedList(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean add(Object object) {
        // logic

        size++;
        return false;
    }

    @Override
    public void clear() {

    }
}
