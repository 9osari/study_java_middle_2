package practiceOOP;

public class InputValidator {

    public boolean lenCheck(String input) {
        if(!(input.length() == 3)) {
            System.out.println("Check input length Game ReStart");
            return false;
        }
        return true;
    }
}
