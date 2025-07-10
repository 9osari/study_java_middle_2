package practiceOOP;

public class Process {
    public String check(String answer, String input) {
        int strike = 0;
        int ball = 0;

        for(int i = 0; i < 3; i++) {
            if(answer.charAt(i) == input.charAt(i)) {
                strike++;
            } else if(answer.contains(String.valueOf(input.charAt(i)))) {
                ball++;
            }
        }
        return strike + "S " + ball + "B";
    }
}
