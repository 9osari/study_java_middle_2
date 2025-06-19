package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 300);
        Cat cat = new Cat("야옹이", 300);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat reCat = hospital.printAndReturn(cat);
        System.out.println("reCat = " + reCat);
    }
}
