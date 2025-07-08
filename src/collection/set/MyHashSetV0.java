package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    //크기 10 고정
    private int[] elementData = new int[10];
    private int size = 0;

    // O(n)
    public boolean add(int value) {
        //셋에 중복된 값이 있는지 체크
        if(contains(value)) {
            return false;
        }
        elementData[size++] = value;
        return true;
    }

    // O(n)
    public boolean contains(int value) {
        //셋에 값이 있는지 확인
        for(int i = 0; i < size; i++) {
            if(elementData[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
