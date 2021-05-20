package section6.constructor;

public class FloorCarpetChallenge {
    private double width;
    private double length;

    public FloorCarpetChallenge(double width, double length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

   public double getArea(){
        return (width * length);
   }
}
