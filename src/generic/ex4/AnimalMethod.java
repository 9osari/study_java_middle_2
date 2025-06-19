package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {
    //둘다 Animal을 상한으로 제한
    public static <T extends Animal> void checkUp(T t) {
        System.out.println("동물이름: " + t.getName());
        System.out.println("동물크기: " + t.getSize());
        t.sound();
        System.out.println("-----------");
    }

    public static <T extends Animal> T getBigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;   //삼항연산자
    }
}
