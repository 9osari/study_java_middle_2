package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<String>()); //입력 순서 보장 안함 O(1)
        run(new LinkedHashSet<String>()); //입력 순서 보장 O(1)
        run(new TreeSet<String>()); //데이터 값을 기준으로 정렬 O(log N)
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { //다음 데이터 확인
            System.out.print(iterator.next() + " "); //다음 데이터 반환
        }
        System.out.println();
    }
}

