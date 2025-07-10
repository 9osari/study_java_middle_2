package practiceOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Computer {
    private final String answer;

    public Computer() {
        this.answer = question();
    }

    public String getAnswer() {
        return answer;
    }

    private String question() {
        //0~9 숫자 3개 생성
        List<Integer> num = new ArrayList<>(IntStream.rangeClosed(0, 9).boxed().toList());
        Collections.shuffle(num); //숫자 섞기
        return num.get(0).toString() + num.get(1).toString() + num.get(2).toString(); //반환
    }
}
