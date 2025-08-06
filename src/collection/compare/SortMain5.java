package collection.compare;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> set1 = new TreeSet<>(); //들어가는 순간 저장
        set1.add(myUser1);
        set1.add(myUser2);
        set1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(set1);

        TreeSet<MyUser> set2 = new TreeSet<>(new IdComparator()/*.reversed()*/);
        set2.add(myUser1);
        set2.add(myUser2);
        set2.add(myUser3);
        System.out.println("idComparator 정렬");
        System.out.println(set2);

    }
}
