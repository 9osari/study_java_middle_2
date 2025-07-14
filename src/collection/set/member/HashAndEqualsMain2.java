package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //m1.hashCode() = 65
        System.out.println("m2.hashCode() = " + m2.hashCode()); //m2.hashCode() = 65
        /**
         * equals()를 재정의 하지 않아 Object의 equals()를 상속 받아 사용
         * 따라서 인스턴스의 참조값을 비교 그러므로 false
         */
        System.out.println("m1.equals(m2): " + m1.equals(m2)); //m1.equals(m2): false

        //참조값 확인 코드
        System.out.println("system.identityHashCode(m1) = " +System.identityHashCode(m1));
        System.out.println("system.identityHashCode(m2) = " +System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); //searchValue.hashCode() = 1225358173
        boolean contains = set.contains(searchValue); //다른 위치에서 데이터를 찾게 되고
        System.out.println("contains = " + contains);// 검색 실패 false
    }
}
