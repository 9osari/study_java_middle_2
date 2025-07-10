package practiceOOP;

public class InputValidator {

    public boolean lenCheck(String input) {
        if (input.length() != 3) {
            System.out.println("3자리 숫자를 입력하세요.");
            return false;
        }
        return true;
    }
}
