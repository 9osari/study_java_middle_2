package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        //모든 노드 참색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLastNode(first);
        System.out.println(lastNode);

        //특정 인덱스 노드 조회하기
        int index = 2;
        System.out.println("특정 인덱스 노드 조회하기");
        Node index2Nide = getNode(first, index);
        System.out.println(index2Nide.item);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    private static void add(Node first, String d) {
        Node lastNode = getLastNode(first); //마지막 노드를 찾아서
        lastNode.next = new Node(d); //넣어줌
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
