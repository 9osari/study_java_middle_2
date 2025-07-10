package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); //hasIndex중복
        System.out.println(set);


        //검색
        int searchVal = 9;
        boolean result = set.contains(searchVal);
        System.out.println("set.contains(" + searchVal + ") = " + result);

        //삭제
        boolean remove = set.remove(searchVal);
        System.out.println("set.remove(" + searchVal + ") = " + remove);
        System.out.println(set);
    }
}
