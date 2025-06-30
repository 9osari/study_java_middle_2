package collection.arraylist_study;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 arr = new MyArrayListV2();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        System.out.println(arr);

        //원하는 위치에 추가
        arr.add(3, "addLast");
        System.out.println(arr);

        arr.add(0, "addFirst");
        System.out.println(arr);

        //삭제
        Object remove = arr.remove(4);
        System.out.println(remove + " 삭제 = " + arr);

        Object remove1 = arr.remove(0);
        System.out.println(remove1 + " 삭제 = " + arr);
    }
}
