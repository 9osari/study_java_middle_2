package practiceOOP;

public class Process {
    public String check(int[] answer, int[] input) {
        int strike = 0;
        int ball = 0;

        for(int i = 0; i < 3; i++) {
            if(answer[i] == input[i]) strike++; //정답과 입력값 같으면
            else if(contains(answer, input[i])) ball++;
        }
        return strike + "S " + ball + "B";
    }

    private boolean contains(int[] answer, int input) {
        for (int i : answer) {
            if(i == input) return true;
        }
        return false;
    }
}
