package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; //LinkedList가 들어가는 배열
        for(int i = 0; i < CAPACITY; i++){
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); //중복
        System.out.println(Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        int value = hashIndex(searchValue);
        boolean contains = contains(buckets, value);
        System.out.println("buckets.contains("+searchValue+") = " + contains);


    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        if(!bucket.contains(value)) { //중복체크 //O(n)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //[99, 9] 나옴
        return bucket.contains(value); //contains = 루프 자동으로 돌아줌 true/false
    }

    public static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
