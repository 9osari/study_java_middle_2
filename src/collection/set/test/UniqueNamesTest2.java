package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};


        //입력 순서대로 출력
        HashSet<Integer> hashSet = new LinkedHashSet<>(Arrays.asList(inputArr));
        System.out.println(hashSet);
    }
}
