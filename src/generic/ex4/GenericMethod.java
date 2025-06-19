package generic.ex4;

public class GenericMethod {

    public static Object objectMethod(Object obj) {
        System.out.println("objectMethod " + obj);
        return obj;
    }

    //재네릭 메서드를 정의할 땐 메서드의 반환 타입 왼쪽 <>를 사용해 <T>와 같이 타입 매개변수를 적어줌
    public static <T> T geneticMethod(T t) {
        System.out.println("geneticMethod " + t);
        return t;
    }

    /**
     * 제니릭 메서드도 타입 매개변수 제한 가능 Number와 그 자식만 받을 수 있음!
     */
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("numberMethod " + t);
        return t;
    }
}

/**
 *  제네릭 메서드는 인스턴스 메서드와 스테틱 메서드에 모두 적용할 수 있당
 */
class StBox<T> {    //제네릭 타입
    static <V> V staticMethod(V v) {return v;}  //static 메서드에 제네릭 메서드 도입
    <Z> Z instanceMethod(Z z) {return z;}   //인스턴스 메서드에 제네릭 메서드 도입 가능
}

class Box<T> {
    /**
     * 제네릭 타입은 static 메서드에 타입 매개변수를 사용할 수 없다.
     * 제네릭 타입은 객체를 생성하는 시점에 타입이 정해지지만
     * static 메서드는 인스턴스 단위가 아니라 클래스 단위로 작동하기 때문에 제네릭과 무관
     */
    T instanceMethod(T t) {return t;}   //인스턴스 메서드에선 가능
    //static T staticMethod(T t) {return t;} 재네릭 타입의 T 사용 불가
}
