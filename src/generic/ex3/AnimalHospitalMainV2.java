package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<Dog>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<Cat>();
        AnimalHospitalV2<Integer> intHospital = new AnimalHospitalV2<Integer>();
        AnimalHospitalV2<Object> objHospital = new AnimalHospitalV2<Object>();

        //최소한 Animal이나 그 자식을 타입 인자로 제한하고 싶다.
    }
}
