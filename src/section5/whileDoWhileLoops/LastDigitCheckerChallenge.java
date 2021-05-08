package section5.whileDoWhileLoops;

public class LastDigitCheckerChallenge {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(992, 26, 32));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        while (isValid(num1) && isValid(num2) && isValid(num3)) {
            return ((num1 % 10 == num2 % 10) || (num2 % 10 == num3 % 10) || (num1 % 10 == num3 % 10));
        }
        return false;
    }
    public static boolean isValid(int number) {
return(number >= 10 && number <= 1000);
    }
}
