package section5.whileDoWhileLoops;

public class PassingValueFromString {
    public static void main(String[] args) {
        String numAsString = "2018.125";
        System.out.println("numberAsString = " + numAsString);

        double number = Double.parseDouble(numAsString);
        System.out.println("number = " + number);

        numAsString +=1;
        number +=1;

        System.out.println("numberAsString -> "+ numAsString);
        System.out.println("number -> " +number);

    }
}
