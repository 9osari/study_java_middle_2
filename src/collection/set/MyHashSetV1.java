package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 10; //배열의 크기
    
    LinkedList<Integer>[] bukets;
    
    private int size= 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int initialCapacity) {
        this.capacity = initialCapacity;
        initBuckets();
    }

    private void initBuckets() {
        bukets = new LinkedList[capacity];
        for(int i = 0; i < capacity; i++) {
            bukets[i] = new LinkedList<>();
        }
    }


    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = bukets[hashIndex]; //O(1)
        if(bucket.contains(value)) { //O(1) -> 평균적으로 데이터가 1,2개
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    //삭제
    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = bukets[hashIndex]; //O(1)
        boolean result = bucket.remove(Integer.valueOf(value)); //숫자를 넘기면 인덱스 위치를 지움, Integer.valueOf하면 값을 지움 //O(1)
        if(result) { //값이 지워졌으면
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = bukets[hashIndex]; //O(1)
        return bucket.contains(searchValue); //O(1) 데이터가 1개만
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "bukets=" + Arrays.toString(bukets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    //등록 삭제 모두 평균 //O(1)로 연산 속도 증가
}
