package generic.test.ex1;

public class Container<V> {
    private V value;


    public boolean isEmpty() {
        return value == null;
    }

    public void setItem(V data1) {
        this.value = data1;
    }
    public V getItem() {
        return this.value;
    }
}
