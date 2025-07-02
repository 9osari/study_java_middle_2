package collection.linkedlist_study;

public class MyNode {
    //단방향 연결 리스트(Singly Linked List)
    Object data; //노드가 가지는 실제 값
    MyNode next; //다음 노드를 가리키는 참조(포인터)
    //앞 노드도 알고 있는건 양방향 연결 리스트(Doubly Linked List)
    //MyNode prev;

    public MyNode(Object data) {
        this.data = data;
    }

    //[A->B->C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyNode x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.data);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
