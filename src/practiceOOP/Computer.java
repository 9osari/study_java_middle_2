package practiceOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Computer {
    private final int[] answer;

    public Computer() {
        this.answer = question();
    }

    public int[] getAnswer() {
        return answer;
    }

    private int[] question() {
        //0~9 숫자 3개 생성
        List<Integer> num = new ArrayList<>(IntStream.rangeClosed(0, 9).boxed().toList());
        Collections.shuffle(num); //숫자 섞기
        return new int[]{num.get(0), num.get(1), num.get(2)};
    }
}
