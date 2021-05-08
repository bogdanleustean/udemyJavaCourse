package section3.primitiveTypeData.floatingDouble;

public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float min value = " + myMinFloatValue);
        System.out.println("float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("intValue -> " + myIntValue);
        System.out.println("floatValue -> " + myFloatValue);
        System.out.println("doubleValue -> " + myDoubleValue);
    // challenge --------------->

        double numberOfPounds = 70;
        double convertedKg =  numberOfPounds * 0.4535;
        System.out.println(" convertedKg -> " + convertedKg);

    }
}
