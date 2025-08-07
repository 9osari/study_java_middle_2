package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1,2,3);

        //가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list); //다시 만듬
        mutableList.add(4);
        System.out.println("mutableList: " + mutableList);
        System.out.println("mutableList.class: " + mutableList.getClass());

        //다시 불변리스트로
        Collection<Integer> unmodifiableList = Collections.unmodifiableCollection(list);
        System.out.println("unmodifiableList: " + unmodifiableList);
        /*unmodifiableList.add(4); //예외 터짐 */


    }
}
