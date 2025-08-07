package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list.class: " + list.getClass());
        //멀티스레드 상황에 동기화 문제가 발생하지 않도록 안전한 리스트로 바꾸기
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList.class: " + synchronizedList.getClass());
    }
}
