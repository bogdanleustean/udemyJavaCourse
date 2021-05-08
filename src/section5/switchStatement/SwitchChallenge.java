package section5.switchStatement;

import java.util.Locale;

public class SwitchChallenge {
    public static void main(String[] args) {
        char switchChar = 'D';

        switch (switchChar) {
            case 'A':
                System.out.println(" the value is A ");
                break;
            case 'B':
                System.out.println(" the value is B ");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("the value is  " + switchChar);
                break;
            default:
                System.out.println("your letter is not A,B,C,D,E");
                break;
        }
        String month = "DeCEMBER";

        switch (month.toLowerCase()) {
            case "april":
                System.out.println(" the value is April ");
                break;
            case "september":
                System.out.println(" the value is Semt");
                break;
            case "december":
            case "october":
            case "november":
                System.out.println("the value is " + month);
                break;
            default:
                System.out.println("not sure");
                break;
        }
    }
}