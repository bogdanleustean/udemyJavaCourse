package section5.whileDoWhileLoops;

public class NumberPalindromeChallenge {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));
    }
public static boolean isPalindrome(int number){
     int reverse = 0;
     int orginalNumber = number;
     while(number != 0){
         int lastDigit = number % 10;
         reverse *= 10;
        reverse += lastDigit;
         number /= 10;
      }
       return orginalNumber == reverse;
    }
}
