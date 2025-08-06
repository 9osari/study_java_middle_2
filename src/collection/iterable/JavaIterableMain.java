package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printList(list.iterator());

        System.out.println();

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printList(set.iterator());


        foreach(list);
        foreach(set);
    }

    private static void foreach(Iterable<Integer> iterable) {
        for (Integer i : iterable) {
            System.out.print(i + " ");
        }
    }

    private static void printList(Iterator<Integer> list) {
        System.out.println("iterator = " + list.getClass());
        while (list.hasNext()) {
            System.out.print(list.next() + " ");
        }
    }

}
