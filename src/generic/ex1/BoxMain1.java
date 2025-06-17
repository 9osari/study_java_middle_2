package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(111); //오토 박싱으로 int -> Integer 자동변환
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        //double, boolean 을 포함한 다양한 타입을 담는 박스가 필요하다면 각각의 타입별로 클래스를 새로 만들어야 한다
        //담는 타입이 수십개라면 어떻게 이 문제를 해결할까?
    }
}
