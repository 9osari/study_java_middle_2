package generic.ex3;

import generic.animal.Animal;

//T를 Aniaml과 그 자식만 받을 수 있도록 제한을 두는 것
//즉 T의 상한은 Animal
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getbigger(T target) {
        return animal.getSize() >  target.getSize() ? animal : target;  //삼항연산자
    }
}
