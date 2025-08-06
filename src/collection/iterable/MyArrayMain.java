package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray array = new MyArray(new int[]{1,2,3,4});

        Iterator<Integer> iterator = array.iterator(); //반복자를 반환
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("for-each 사용");
        for(int value : array) System.out.println("value = " + value);
    }
}
