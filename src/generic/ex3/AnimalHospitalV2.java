package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에서 알 수 없다. Object가 제공하는 메서드만 호출가능
        animal.equals(null);
        animal.toString();

        //컴파일 오류
        /*System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();*/
    }

    public T bigger(T target) {
        /*return animal.getSize() >  target.getSize() ? animal : target;  //삼항연산자*/
        return null;
    }
}
