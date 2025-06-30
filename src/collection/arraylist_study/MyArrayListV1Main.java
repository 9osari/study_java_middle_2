package collection.arraylist_study;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 arr1 = new MyArrayListV1();

        arr1.add("a");
        arr1.add("b");
        arr1.add("c");
        arr1.add("d");
        arr1.add("e");
        arr1.add("f");
        arr1.remove(2);
        arr1.remove(0);
        System.out.println(arr1);
        System.out.println("f를 찾기 = " +arr1.indexOf("f"));

        System.out.println("d -> c 변경");
        arr1.set(1,"c");
        System.out.println(arr1);

    }
}
