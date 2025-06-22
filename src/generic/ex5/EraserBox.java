package generic.ex5;

public class EraserBox<T> {

    //컴파일 이후에는 제네릭 타입 정보가 존재하지 않는다.
    //따라서 런타임에 타입을 화용하는 코드는 작성불가
    public boolean instanceCheck(Object param) {
        return param instanceof T; //오류
    }

    public T create() {
        return new T(); //오류
        return null;
    }
}
