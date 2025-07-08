package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        //{1,2,5,8,14,99}
        System.out.println("hashIndex(1) = " + hashindex(1));
        System.out.println("hashIndex(2) = " + hashindex(2));
        System.out.println("hashIndex(5) = " + hashindex(5));
        System.out.println("hashIndex(8) = " + hashindex(8));
        System.out.println("hashIndex(14) = " + hashindex(14));
        System.out.println("hashIndex(99) = " + hashindex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        //검색
        int searchValue = 14;
        int hashIndex = hashindex(searchValue); //hashIndex를 구한 후
        System.out.println("searchValue hashIndex= " + hashIndex);
        Integer result = inputArray[hashIndex]; //O(1)
        System.out.println("result = " + result);
    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashindex(value); //hashIndex를 먼저 구한 후
        inputArray[hashIndex] = value; //값을 넣음
    }

    //hashIndex를 반환
    static int hashindex(int value) {
        return value % CAPACITY;
    }
}
