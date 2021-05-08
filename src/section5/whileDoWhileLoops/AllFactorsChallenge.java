package section5.whileDoWhileLoops;

public class AllFactorsChallenge {
    public static void main(String[] args) {
        int number = 18;
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
