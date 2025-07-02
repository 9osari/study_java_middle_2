package collection.linkedlist_study;

public class MyLinkedList {

    private MyNode head; // 연결 리스트의 첫 번째 노드를 가리키는 참조 (시작점)
    private int size;


    //입력받은 순서의 노드를 가져옴
    public Object get(int index) {
        MyNode x = getNode(index);
        return x.data;
    }

    //입력받은 순서와 데이터를 삽입
    public Object set(int index, Object e) {
        MyNode x = getNode(index);
        Object oldValue = x.data;
        x.data = e;
        return oldValue;
    }

    //index번째 노드 삭제
    public Object remove(int index) {
        MyNode x = getNode(index); //삭제할 노드 가져옴
        Object oldValue = x.data; //그 노드의 data를 oldValue에 저장
        if(index == 0) { //삭제노드가 첫번째면
            head = head.next; //head를 다음 노드로 이동시킴
        } else {
            MyNode prev = getNode(index - 1); //이전 노드를 가져와
            prev.next = x.next; //이전 노드가 삭제 대상의 다음 노드를 가리키게 만듦
        }
        x.next = null; //삭제 노드의 next 참조를 끊어 메모리 누수 방지
        size--; //리스트 크기 감소
        return oldValue; //삭제된 노드의 데이터 반환
    }

    //맨 끝에 새로운 노드를 추가
    public void add(Object e) {
        MyNode newNode = new MyNode(e); //1. 입력받은 e로 새 노드 생성 (item = e, next = null)
        if(head == null) { //2. 리스트가 비어있으면
            head = newNode; //3. 새 노드가 첫 노드가 됨
        } else {
            MyNode lastNode = getLastNode(); //4. 마지막 노드를 lastNode에 저장
            lastNode.next = newNode; // 5. 그 뒤에 새 노드를 연결
        }
        size++;
    }

    //index 위치에 새로운 노드 추가
    public void add(Object e, int index) {
        MyNode newNode = new MyNode(e); //새 노드 생성
        if(index == 0) {
            newNode.next = head;
            head = newNode; //새 노드가 첫 노드가 됨
        } else {
            MyNode prev = getNode(index -1); //새 노드를 넣을 직전 노드를 찾음
            newNode.next = prev.next; //새 노드의 next는 기존 prev 뒤의 노드로 연결
            prev.next = newNode;
        }
        size++;
    }

    //마지막 노드를 찾기
    public MyNode getLastNode() {
        MyNode x = head; //리스트의 첫 번째 노드인 head를 x에 저장
        while(x.next != null) { //x가 마지막이 아닐때까지 반복
            x = x.next;
        }
        return x; //x는 마지막 노드 반환
    }

    //index 번째 있는 노드 찾기
    private MyNode getNode(int index) {
        MyNode x = head;
        for(int i= 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        MyNode x = head;
        while(x != null) {
            sb.append(x.data);
            if(x.next != null) {
                sb.append(", ");
            }
            x = x.next;
        }
        sb.append("]");
        sb.append(" size = " + size);
        return sb.toString();
    }

}
