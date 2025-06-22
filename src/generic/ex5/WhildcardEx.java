package generic.ex5;

import generic.animal.Animal;

public class WhildcardEx {

    //제네릭 메서드
    //Box<Dog> dogBox를 전달. 타입 추론에 의해 타입 T가 Dog가 된다.
    static <T> void printGenericV1(Box<T> box) {
        //Box<T> box 제네릭 타입을 받아 출력
        System.out.println("T = " +box.get());
    }

    //제니릭 메서드 X 일반적인 메서드
    //Box<Dog> dogBox를 전달. 와일드 카드 ?는 모든 타입을 받을 수 있음.
    //?만 사용한 다 받는 와일드카드를 비제한 와일드카드라 함.
    static void printWildcardV1(Box<?> box) {
        // ? = 아무거나 ex) Box<Dog> Box<Cat> Box<Object>
        System.out.println("? = " +box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        //T에 상한을 Animal로 해서 Animal의 기능 사용 가능
        T t = box.get();
        System.out.println("이름 = " +t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        //T에 상한을 Animal로 해서 Animal의 기능 사용 가능
        T t = box.get();
        System.out.println("이름 = " +t.getName());
        return t;   //반환까지
    }

    //와일드카드에도 상한을 걸 수 있다.
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " +animal.getName());
        return animal;   //반환까지
    }
    //와일드 카드는 이미 만들어진 지네릭 타입을 가져다 활용할 때 사용

}
