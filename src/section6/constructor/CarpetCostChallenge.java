package section6.constructor;

public class CarpetCostChallenge {
    public static void main(String[] args) {

        CarpetCarpetChallenge carpet = new CarpetCarpetChallenge(3.5);
        FloorCarpetChallenge floor = new FloorCarpetChallenge(2.75,4.0);
        CalculatorCarpetChallenge calculator = new CalculatorCarpetChallenge(floor,carpet);
        System.out.println(" total = "+calculator.getTotalCost());
        carpet = new CarpetCarpetChallenge(1.5);
        floor = new FloorCarpetChallenge(5.4, 4.5);
        calculator = new CalculatorCarpetChallenge(floor, carpet);
        System.out.println(" new total = "+ calculator.getTotalCost());

    }
}
