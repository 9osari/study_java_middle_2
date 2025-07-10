package practiceOOP;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);
    private final Computer computer = new Computer();
    private final Process process = new Process();

    public void play() {
        System.out.println("Game Start!");
        InputValidator inputValidator = new InputValidator();
        int count = 0;

        while (true) {
            System.out.println("디버깅용 = " + Arrays.toString(computer.getAnswer()));
            System.out.print("input Number (GameCoin = " + count + "): ");

            String inputNum = scanner.nextLine();
            if(!inputValidator.lenCheck(inputNum)) break;

            int[] inputDigit = inputNum.chars().map(c -> c - '0').toArray();

            count++;
            String result = process.check(computer.getAnswer(), inputDigit); //문제랑 입력값 체크
            System.out.println("result = " + result);
            if(result.equals("3S 0B")) {
                System.out.println("Game End! you Win!");
                break;
            } else if(count == 20) {
                System.out.println("Game End! you Lose!");
                break;
            }
        }
    }
}
