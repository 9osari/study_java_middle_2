package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐용이", 200);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog targetDog = new Dog("큰 멍멍이", 300);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog); //타입 추론 활용
        System.out.println("bigger = " + bigger);
    }
}
