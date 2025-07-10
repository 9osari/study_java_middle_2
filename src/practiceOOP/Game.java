package practiceOOP;

import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);
    private final Computer computer = new Computer();
    private final Process process = new Process();

    public void play() {
        InputValidator inputValidator = new InputValidator();

        System.out.println("Game Start!");

        int count = 0;
        while (true) {
            System.out.print("input Number (GameCoin = " + count + "): ");

            String input = scanner.nextLine();

            if(!inputValidator.lenCheck(input)) continue; //3자리 인지? 확인 후 계속 진행

            count++;
            String result = process.check(/*computer.getAnswer()*/"123", input); //문제랑 입력값 체크
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
