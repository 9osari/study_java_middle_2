package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 10; //배열의 크기

    //모든 타입을 다 넣어야하니 Object
    private LinkedList<Object>[] bukets;

    private int size= 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int initialCapacity) {
        this.capacity = initialCapacity;
        initBuckets();
    }

    private void initBuckets() {
        bukets = new LinkedList[capacity];
        for(int i = 0; i < capacity; i++) {
            bukets[i] = new LinkedList<>();
        }
    }


    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = bukets[hashIndex]; //O(1)
        if(bucket.contains(value)) { //O(1) -> 평균적으로 데이터가 1,2개
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    //삭제
    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = bukets[hashIndex]; //O(1)
        boolean result = bucket.remove(value); //숫자를 넘기면 인덱스 위치를 지움, Integer.valueOf하면 값을 지움 //O(1)
        if(result) { //값이 지워졌으면
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue); //O(1)
        LinkedList<Object> bucket = bukets[hashIndex]; //O(1)
        return bucket.contains(searchValue); //O(1) 데이터가 1개만
    }

    private int hashIndex(Object value) {
        //1. 해시 코드 구하기 (그냥 호출 ㅋㅋ)
        //2. 양수로 바꿔준다음(절댓값) 해시 인덱스 생성
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "bukets=" + Arrays.toString(bukets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
