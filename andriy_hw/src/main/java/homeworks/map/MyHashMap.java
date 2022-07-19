package homeworks.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private int size;
    private Node<K, V>[] buckets;
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public MyHashMap() {
        this.buckets = new Node[DEFAULT_INITIAL_CAPACITY];
    }

    private int getBucketSize() {
        return buckets.length - 1;
    }

    private int getHashCode(Object key) {
        if (key == null) {
            return 0;
        }
        int bucketIndex = Math.abs(key.hashCode()) % DEFAULT_INITIAL_CAPACITY;
        return bucketIndex;
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
    public boolean containsKey(Object key) {
        if (key == null) {
            return false;
        }
        int hashPoz = getHash(key) % getBucketSize();
        if (buckets[hashPoz] == null) {
            return false;
        }
        for (Node node : buckets) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        if (value == null) {
            return false;
        }
        for (Node<K, V> element : buckets) {
            while (element.value.equals(value)) {
                put(element.key, element.value);
                element = element.next;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        Node<K, V> bucket = buckets[getHash(key) % getBucketSize()];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

    public void resize() {
        Node<K, V>[] old = buckets;
        int capacity = DEFAULT_INITIAL_CAPACITY * 2;
        size = 0;
        buckets = new Node[capacity];
        for (Node<K, V> element : old) {
            while (element != null) {
                put(element.key, element.value);
                element = element.next;
            }
        }
    }

    private int getHash(Object key) {
        if (key == null) {
            return 0;
        } else {
            return Math.abs(key.hashCode());
        }
    }

    @Override
    public V put(K key, V value) {
        if (size >= DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY) {
            resize();
        }
        Node<K, V> node = new Node<>(key, value, null);
        int bucket = getHash(key) % getBucketSize();
        Node<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = node;
            size++;
        } else {
            // порівнюю ключі, дізнаючись чи він вже існує
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                }
                existing = existing.next;
            }
            if (existing.key.equals(key)) {
                existing.value = value;
            } else {
                existing.next = node;
                size++;
            }
        }
        return value;
    }

    @Override
    public V remove(Object key) {
        int keyBucket = getHashCode(key);
        Node<K, V> temp = buckets[keyBucket];
        if (temp == null) {
            return null;
        }
        Node<K, V> prev = temp;
        while (temp != null) {
            if (temp.key != null && temp.key.equals(key)) {
                V valueReturn = temp.value;
                if (prev == temp) {
                    buckets[keyBucket] = temp.next;
                } else {
                    prev.next = temp.next;
                }
                size--;
                return valueReturn;
            }
            prev = temp;
            temp = temp.next;
        }
        return null;
    }

    @Override
    public void putAll(MyMap<? extends K, ? extends V> map) {
        List<? extends Node<? extends K, ? extends V>> nodes = map.entrySet();
        for (Node<? extends K, ? extends V> node : nodes) {
            this.put(node.key, node.value);
        }
    }

    @Override
    public void clear() {
        Node<K, V>[] tab;
        if ((tab = buckets) != null && size > 0) {
            size = 0;
            for (int integer = 0; integer < tab.length; integer++) {
                tab[integer] = null;
            }
        }
    }

    @Override
    public List<K> keySet() {
        List<Node<K, V>> nodes = entrySet();
        K keys;
        ArrayList<K> kList = new ArrayList<>();
        for (Node<K, V> node : nodes) {
            keys = node.key;
            kList.add(keys);
        }
        return kList;
    }

    @Override
    public Collection<V> values() {
        List<Node<K, V>> nodes = entrySet();
        V values;
        ArrayList<V> kList = new ArrayList<>();
        for (Node<K, V> node : nodes) {
            values = node.value;
            kList.add(values);
        }
        return kList;
    }

    @Override
    public List<Node<K, V>> entrySet() {
        return Arrays.asList(buckets);
    }

    public static class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}

