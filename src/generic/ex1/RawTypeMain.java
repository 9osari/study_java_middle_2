package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();   //Raw 타입 또는 원시 타입 -> 내부 타입 매개변수가 Object로 사용
        //GeneticBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get(); //다운 캐스팅
        System.out.println("result = " + result);

        //로 타입은 사용하지 말고 Object 타입을 사용해야 한다면 타입 인자로 Object를 지정해 사용
        GenericBox<ObjectBox> integerBox2 = new GenericBox<>();
    }
}
