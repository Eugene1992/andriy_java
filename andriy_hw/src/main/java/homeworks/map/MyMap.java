package homeworks.map;

import java.util.Collection;
import java.util.List;

public interface MyMap<K, V> {

    int size();

    boolean isEmpty();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    V get(Object key);

    V put(K key, V value);

    V remove(Object key);

    void putAll(MyMap<? extends K, ? extends V> map);

    void clear();

    List<K> keySet();

    Collection<V> values();

    List<MyHashMap.Node<K, V>> entrySet();
}
