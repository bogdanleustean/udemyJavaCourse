package section4.methods;

public class Test {
    public static void main(String[] args) {
      // MegaBytesConverter.printMegaBytesAndKiloBytes( 2500);
       // MegaBytesConverter.printMegaBytesAndKiloBytes( 5000);
      //  MegaBytesConverter.printMegaBytesAndKiloBytes( 0);

      //  System.out.println(BarkingDog.shouldWakeUp(true, 2));
      //  System.out.println(LeapYear.isLeapYear(20001));
        int kiloBytes = 2500;
        int kilobytes =  kiloBytes % 1024;
        int megabytes = kiloBytes / 1024 ;

       // System.out.println(megabytes  + "  mega");
       //System.out.println(kilobytes + " kilo");

       // System.out.println(LeapYear.isLeapYear(-1200));
       // System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.12345,3.123));
        System.out.println(EqualSumChecker.hasEqualSum(1,-1, 0));
    }
}
