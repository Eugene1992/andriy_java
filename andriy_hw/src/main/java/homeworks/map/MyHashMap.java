package homeworks.map;

import java.util.Collection;
import java.util.List;

public class MyHashMap<K, V> implements MyMap<K, V> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(MyMap<? extends K, ? extends V> map) {

    }

    @Override
    public void clear() {

    }

    @Override
    public List<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }
}
