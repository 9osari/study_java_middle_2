package generic.ex1;

public class IntegerBox {
    //숫자를 보관하고 꺼내는 단순한 기능
    private Integer value;

    public void set(Integer value) {
        this.value = value;
    }

    public Integer get() {
        return value;
    }

}
