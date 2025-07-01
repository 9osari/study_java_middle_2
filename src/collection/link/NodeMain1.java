package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기
        Node first = new Node("A"); //Node 인스턴스를 생성하고 item에 A 삽입
        //Node 인스턴스를 생성하고 item에 B 삽입 후 처음만든 노드의 Next 필드에 새로 만든 노드의 next 필드에 새로 만든 노드의 참조값을 삽입
        first.next = new Node("B"); //그렇게 하면 첫 번째 노드와 두 번째 노드가 서로 연결
        first.next.next = new Node("C");
        //x01.next.next = x03
        //x02.next = x03

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
