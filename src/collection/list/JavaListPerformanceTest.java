package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==ArrayList Add==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size); //찾는데 O(1), 추가하는데(밀기) O(n)
        ArrayList<Integer> arrayList = new ArrayList<>(size); //조회용 데이터로 사용
        addLast(arrayList, size);//찾는데 O(1), 추가하는데(밀기) O(1)

        System.out.println();
        int loop = 10000;
        System.out.println("==ArrayList 조회==");
        getIndex(arrayList, loop, 0); //앞에서 조회
        getIndex(arrayList, loop, size/2); //중간에서 조회
        getIndex(arrayList, loop, size - 1); //끝에서 조회

        System.out.println();
        System.out.println("==ArrayList 검색==");
        search(arrayList, loop, 0); //앞에서 조회
        search(arrayList, loop, size/2); //중간에서 조회
        search(arrayList, loop, size - 1); //끝에서 조회

        System.out.println();
        System.out.println("==LinkedList Add==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size); //찾는데 O(n), 추가하는데 O(1)
        LinkedList<Integer> linkedList = new LinkedList<>();//조회용 데이터로 사용
        addLast(linkedList, size);//찾는데 O(1), 추가하는데(밀기) O(1)

        System.out.println();
        System.out.println("==LinkedList 조회==");
        getIndex(linkedList, loop, 0); //앞에서 조회
        getIndex(linkedList, loop, size/2); //중간에서 조회
        getIndex(linkedList, loop, size - 1); //끝에서 조회

        System.out.println();
        System.out.println("==LinkedList 검색==");
        search(linkedList, loop, 0); //앞에서 조회
        search(linkedList, loop, size/2); //중간에서 조회
        search(linkedList, loop, size - 1); //끝에서 조회

    }
    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복 " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복 " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " +size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2 ,i); //대략 중간쯤
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " +size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " +size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
