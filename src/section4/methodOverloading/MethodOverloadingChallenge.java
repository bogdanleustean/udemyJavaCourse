package section4.methodOverloading;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(-16, 0);
        calcFeetAndInchesToCentimeters(6, 14);
        double cmTest = calcFeetAndInchesToCentimeters(6, 91);
        if (cmTest < 0.0) {
            System.out.println("Invalid param");
        }

         calcFeetAndInchesToCentimeters(-10);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println(" invalid param");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println(" wrong param for the overload methof");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
  return calcFeetAndInchesToCentimeters(feet, remainingInches );
    }
}
