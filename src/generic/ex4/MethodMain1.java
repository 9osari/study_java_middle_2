package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 9000;
        Object object = GenericMethod.objectMethod(i); //Integer를 받으려면 캐스팅 필요
        //근디 캐스팅 하기 싫은 넣은걸 그대로 쓰고싶음


        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");


        //제네릭 메서드는 메서드를 호출하는 시점 <>를 사용해 <Integer>와 같이 타입을 정하고 호출
        Integer result = GenericMethod.<Integer>geneticMethod(i);
        Integer intValue = GenericMethod.<Integer>numberMethod(1000);
        Double result2 = GenericMethod.<Double>numberMethod(3.14);


        //타입 추론, 타입 인자 생략
        Integer intVal1 = GenericMethod.geneticMethod(i);
        Integer intVal2 = GenericMethod.numberMethod(1000);
        Double doubleVal = GenericMethod.numberMethod(3.14);
        //타입 인자가 전달하지 않는 것 처럼 보이지만 실제론 타입 인자가 전달된다.


        //컴파일 오류 Number와 자식만 가능
        //GenericMethod.numberMethod("hello");
        GenericMethod.numberMethod(11.2);
    }
}
