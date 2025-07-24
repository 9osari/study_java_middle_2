package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};


        //입력 순서대로 출력
        TreeSet<Integer> hashSet = new TreeSet<>(Arrays.asList(inputArr));
        System.out.println(hashSet);
    }
}
