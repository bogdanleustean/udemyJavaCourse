package section6.constructor;

public class CalculatorCarpetChallenge {
    private FloorCarpetChallenge floor;
    private CarpetCarpetChallenge carpet;

    public CalculatorCarpetChallenge(FloorCarpetChallenge floor, CarpetCarpetChallenge carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

   public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
   }
}
