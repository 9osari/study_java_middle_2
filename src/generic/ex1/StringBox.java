package generic.ex1;

public class StringBox {
    //문자를 보관하고 꺼내는 단순한 기능
    private String value;

    public void set(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }
}
