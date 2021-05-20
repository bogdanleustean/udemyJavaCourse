package section6.constructor;

public class CarpetCarpetChallenge {
    private double cost;

    public CarpetCarpetChallenge(double cost) {
        if(cost < 0){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}
