package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = (Integer) integerBox.get();  //다운 캐스팅
        System.out.println("integer = " + object);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //다운 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get();    //String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}
