package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr; // 2. {1,2,3,4} 넘긴걸 targetArr로 가지고 있다.

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
