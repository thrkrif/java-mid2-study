package generic.test.ex2;

public class Pair<K, V> {
    private K key;
    private V value;

    public V getSecond() {
        return value;
    }

    public void setSecond(V value) {
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public void setFirst(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + key +
                ", second=" + value +
                '}';
    }
}
