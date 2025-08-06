package collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer>{

    private int[] number;

    public MyArray(int[] number) {
        this.number = number;
    }

    //구현은 해야함
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(number); //1. 이거를 생성자를 넘겨서
    }
}
