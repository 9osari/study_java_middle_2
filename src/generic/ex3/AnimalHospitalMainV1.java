package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("냐옹1", 200);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1: 개 병원에 고양이 전달
        dogHospital.set(cat);   //매개변수 체크 실패: 컴파일 오류가 발생하지 않음

        //문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍2", 300));
        System.out.println("biggerDog = " + biggerDog);


        /**
         * 코드 재사용: 다형성을 통해 AnimalHospitalV1 하나로 개와 고양이 모두 처리
         * 타입 안정성 X
         *  -> 개 병원에 고양이를 전달하는 문제발생
         *  -> Animal 타입을 반환하기 때문에 다운 캐스팅 필요
         *  -> 고양이를 입력하면 개를 반환하는 상황에 캐스팅 예외 발생!
         */
    }
}
