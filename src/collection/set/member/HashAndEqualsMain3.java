package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //m1.hashCode() = 65
        System.out.println("m2.hashCode() = " + m2.hashCode()); //m2.hashCode() = 65
        System.out.println("m1.equals(m2): " + m1.equals(m2)); //m1.equals(m2): false

        //중복등록 불가 equals에서 걸러짐
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); //searchValue.hashCode() = 1225358173
        boolean contains = set.contains(searchValue); //다른 위치에서 데이터를 찾게 되고
        System.out.println("contains = " + contains);// 검색 실패 false

        System.out.println("Aa.hashCode = " + "Aa".hashCode());
        System.out.println("BB.hashCode = " + "BB".hashCode());

    }
}
