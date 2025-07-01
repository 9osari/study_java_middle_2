package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    //마지막을 찾아 반환
    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object e) {
        int index = 0;
        for(Node x = first; x != null; x = x.next) {
            if (e.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    //추가 코드
    public void add(int index, Object e) {
        //특정 위치에 데이터 추가
        Node newNode = new Node(e);
        if(index == 0) {
            newNode.next = first;
            first = newNode;
        } else { //중간이나 뒷 부분에 들어가는 경우
            Node prev = getNode(index - 1); //직전 노드
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public Object remove(int index) {
        //특정 위치에 데이터 제거
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if(index == 0) {
            first = first.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }
}
