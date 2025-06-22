package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> box = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.set(new Dog("멍멍이", 100));

        //타입추론으로 <Dog> 들어감.
        WhildcardEx.printGenericV1(dogBox);
        WhildcardEx.printGenericV2(dogBox);
        WhildcardEx.printAndReturnGeneric(dogBox);

        //와일트카드 사용
        WhildcardEx.printWildcardV1(dogBox);
        WhildcardEx.printWildcardV2(dogBox);

        Dog dog = WhildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WhildcardEx.printAndReturnWildcard(dogBox);


    }
}
