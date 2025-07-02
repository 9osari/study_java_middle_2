package collection.linkedlist_study;

public class MyLinkedListMainV2 {
    public static void main(String[] args) {
        MyLinkedListV2<String> stringList = new MyLinkedListV2<>();

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println( stringList);

        stringList.remove(0);
        System.out.println( stringList);

        stringList.add("a",0);
        System.out.println( stringList);

        stringList.set(2, "z");
        System.out.println( stringList);

        System.out.println("----------------");
        MyLinkedListV2<Integer> intList = new MyLinkedListV2<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println( intList);

        intList.remove(0);
        System.out.println( intList);

        intList.add(1,0);
        System.out.println( intList);

        intList.set(2, 99);
        System.out.println( intList);

    }
}
