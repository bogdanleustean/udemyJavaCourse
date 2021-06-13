package section6.inheritance.cylinderChallenge;

public class Circle extends  Cylinder {
    private double height;

    public Circle(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getHeight() {
        return height;
    }
   public double getVolume(){
        return( height * getArea());
   }
}
