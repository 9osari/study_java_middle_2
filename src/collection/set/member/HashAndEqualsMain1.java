package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        //m1,m2는 object의 기본기능을 사용하기 때문에 객체의 참조값을 기반으로 해시코드를 생성
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //m1.hashCode() = 1531448569
        System.out.println("m2.hashCode() = " + m2.hashCode()); //m2.hashCode() = 317574433
        System.out.println("m1.equals(m2): " + m1.equals(m2)); //m1.equals(m2): false

        //m1과 m2의 해시코드가 다르기 떄문에 다른위치에 각각 저장
        //id가 "A"로 같은 회원의 데이터가 중복등록 가능
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); //searchValue.hashCode() = 1225358173
        boolean contains = set.contains(searchValue); //다른 위치에서 데이터를 찾게 되고
        System.out.println("contains = " + contains);// 검색 실패 false
    }
}
