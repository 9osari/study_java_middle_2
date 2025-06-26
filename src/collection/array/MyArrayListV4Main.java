package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        //제네릭으로 자료구조의 타입을 정해줄 수 있다 (재사용성 늘림)
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer integer = integerList.get(0);
        System.out.println("integer = " + integer);
    }
}
