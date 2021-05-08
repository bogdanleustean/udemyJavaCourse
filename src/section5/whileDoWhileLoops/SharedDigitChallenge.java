package section5.whileDoWhileLoops;

public class SharedDigitChallenge {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(11, 82));
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        while (((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99))) {
          return    ((num1 % 10 == num2 % 10) || (num1 / 10 == num2 / 10) ||
                    (num1 % 10 == num2 /10) || (num1 / 10 == num2 % 10));

        } return false;
    }
}
