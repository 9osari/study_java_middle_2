package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        /**
         * 여기서 MyArrayList, MyLinkedList 어떤걸 사용할 지 결정
         * 앞에 넣는건 링크드 리스트가 더 빠름
         */
        MyArrayList<Integer> list = new MyArrayList<>();
        //MyLinkedList<Integer> list = new MyLinkedList<>();


        Batchprocessor processor = new Batchprocessor(list);
        processor.logic(50_000);
    }
}
