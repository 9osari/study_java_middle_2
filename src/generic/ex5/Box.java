package generic.ex5;

//데이터를 넣고 반환하는 제네릭 타입
public class Box <T>{
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
