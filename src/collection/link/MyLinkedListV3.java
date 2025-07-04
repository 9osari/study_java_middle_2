package collection.link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size;

    public void add(E e) {
        Node<E> newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    //마지막을 찾아 반환
    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E e) {
        int index = 0;
        for(Node<E> x = first; x != null; x = x.next) {
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
    public void add(int index, E e) {
        //특정 위치에 데이터 추가
        Node<E> newNode = new Node<>(e);
        if(index == 0) {
            newNode.next = first;
            first = newNode;
        } else { //중간이나 뒷 부분에 들어가는 경우
            Node<E> prev = getNode(index - 1); //직전 노드
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public E remove(int index) {
        //특정 위치에 데이터 제거
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if(index == 0) {
            first = first.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    //제네릭 도입 (중첩 클래스)
    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        //[A->B->C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
