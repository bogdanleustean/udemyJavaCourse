package section4.methods;

public class CodingExercise {
    public static void main(String[] args) {

        //checkNumber(5);
        //checkNumber(-10);
        //checkNumber(0);
        System.out.println("miles = "+SpeedConverter.toMilesPerHour(10.5));
        SpeedConverter.printConversion(10.5);

    }
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("positive");
        } else if(number < 0){
            System.out.println("negative");
        } else if(number == 0){
            System.out.println("zero");
        }
    }
}
