package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);


        //검색
        String searchValue = "A";
        boolean contains = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") " +contains);


        //제네릭 덕분에 타입 안정성이 높은 자료 구조를 만들 수 있었다.

    }
}
