package generic.ex1;

public class GenericBox<T> { //<T>를 선언하면 제네릭 클래스 T를 타입 매개변수라 함.
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
