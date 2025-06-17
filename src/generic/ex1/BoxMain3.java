package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        //생성 시점에 T의 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<>();
        /*integerBox.set("1000"); //Integer 타입만 허용, 컴파일 오류*/
        integerBox.set(1000);
        Integer integer = integerBox.get();  //Integer 타입 반환 (캐스팅 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("스트리 잉");
        /*stringBox.set(2000);    //String 타입만 허옹*/
        String string = stringBox.get();
        System.out.println("string = " + string);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(100.0);
        System.out.println("doubleValue = " + doubleBox.get());

        //타입 직접 입력
        GenericBox<Integer> integerBox2 = new GenericBox<Integer>();
        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox3 = new GenericBox<>();
    }
}
