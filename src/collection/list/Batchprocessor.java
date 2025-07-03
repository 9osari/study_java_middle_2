package collection.list;

public class Batchprocessor {

    private final MyList<Integer> list;

    //결정을 나중으로 미룸.
    public Batchprocessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++) {
            list.add(0,i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " +size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
