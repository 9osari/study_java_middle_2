package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 10; //배열의 크기

    //모든 타입을 다 넣어야하니 Object
    private LinkedList<E>[] bukets;

    private int size= 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int initialCapacity) {
        this.capacity = initialCapacity;
        initBuckets();
    }

    private void initBuckets() {
        bukets = new LinkedList[capacity];
        for(int i = 0; i < capacity; i++) {
            bukets[i] = new LinkedList<>();
        }
    }


    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = bukets[hashIndex]; //O(1)
        if(bucket.contains(value)) { //O(1) -> 평균적으로 데이터가 1,2개
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    //삭제
    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = bukets[hashIndex]; //O(1)
        boolean result = bucket.remove(value); //숫자를 넘기면 인덱스 위치를 지움, Integer.valueOf하면 값을 지움 //O(1)
        if(result) { //값이 지워졌으면
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue); //O(1)
        LinkedList<E> bucket = bukets[hashIndex]; //O(1)
        //이 코드가 contains안에 있음 루프를 돌면서 찾음 (equals 사용처)
        /*for(Object object : bucket) {
            if(object.equals(searchValue)) {
                return true;
            }
        }
        return false;*/
        return bucket.contains(searchValue); //O(1) 데이터가 1개만
    }

    private int hashIndex(E value) {
        //1. 해시 코드 구하기 (그냥 호출 ㅋㅋ)
        //2. 양수로 바꿔준다음(절댓값) 해시 인덱스 생성
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "bukets=" + Arrays.toString(bukets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
