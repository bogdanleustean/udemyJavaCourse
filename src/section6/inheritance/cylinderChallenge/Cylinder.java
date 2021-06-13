package section6.inheritance.cylinderChallenge;

import static java.lang.Math.PI;

public class Cylinder {
    private double radius;

    public Cylinder(double radius) {
      if ( radius < 0){
          this.radius = 0;
      }
      else{
          this.radius = radius;
      }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
       return (radius * radius * PI);
    }
}
