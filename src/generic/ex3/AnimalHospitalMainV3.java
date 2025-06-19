package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<Dog>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<Cat>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1 해결: 개 병원에 고양이 전달
        //dogHospital.set(cat); // 다른 타입 입력: 컴파일 오류

        //문제2 해결: 개 타입 반환
        dogHospital.set(dog);
        Dog bigDog = dogHospital.getbigger(new Dog("큰 멍멍이", 2000));
        System.out.println("bigDog = " + bigDog);

        /**
         * 제네릭에 타입 매개변수 상한을 사용해 타입 안정성 문제, 코드 재사용, 제네릭 도입 문제를 해결했다.
         */
    }
}
