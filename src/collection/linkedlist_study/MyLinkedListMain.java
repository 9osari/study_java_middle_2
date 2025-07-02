package collection.linkedlist_study;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        //노드 추가
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);

        //노드 덮어쓰기
        list.set(1, "z");
        System.out.println(list);

        //1번째 노드 찾기
        System.out.println(list.get(0));

        //1번째 노드 삭제
        list.remove(0);
        System.out.println(list);

        //마지막 노드 찾기
        MyNode lastNode = list.getLastNode();
        System.out.println(lastNode);

        //사이즈 확인
        int size = list.size();
        System.out.println(size);

        //2번째에 노드 넣기
        list.add("f", 2);
        System.out.println(list);
    }
}
