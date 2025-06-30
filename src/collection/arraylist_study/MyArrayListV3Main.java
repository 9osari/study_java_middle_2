package collection.arraylist_study;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        /**
         * 제네릭을 도입해 타입 인자로 지정한 타입으로만 데이터를 저장/조회 (타입 안정성 확보)
         */
        MyArrayListV3<String> arr =  new MyArrayListV3<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        String string = arr.get(0);
        System.out.println(string);

        MyArrayListV3<Integer> arr2 =  new MyArrayListV3<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        Integer integer = arr2.get(0);
        System.out.println(integer);
    }
}
