package section3.primitiveTypeData.intLongByte;

public class Main {
    public static void main(String[] args) {
        // int ------------>
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(" int min value = " + myMinIntValue);
        System.out.println(" int max value = " + myMaxIntValue);
        // overflow cand adaugi + 1 o sa cada in minus
        System.out.println("busted int MAX value = " + (myMaxIntValue + 1));

        //underflow cand adaugi - 1 o sa cada in plus
        System.out.println("busted  int MIN value = " + (myMinIntValue -1));

        // byte ---------->
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte min value = "+myMinByteValue);
        System.out.println("byte max value = "+myMaxByteValue);

        // short ----------->
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short min value = "+myMinShortValue);
        System.out.println("short max value = "+myMaxShortValue);

       // long --------------->
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long min value = "+myMinLongValue);
        System.out.println("long max value = "+myMaxLongValue);

        //  chalenge  ----------------->

 byte chByte = 39;
 short chShort = 390;
 int chInt = 1390;
 long chLong = 50000L + 10L *(chByte + chShort + chInt );

        System.out.println( " chanlege = " + chLong);

    }
}
