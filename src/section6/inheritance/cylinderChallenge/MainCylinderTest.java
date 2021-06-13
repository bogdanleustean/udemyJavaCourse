package section6.inheritance.cylinderChallenge;

public class MainCylinderTest {
    public static void main(String[] args) {
Cylinder cyl = new Cylinder(3.75);
        System.out.println("cylinder.radius " + cyl.getRadius());
        System.out.println("cyl area " + cyl.getArea());

 Circle circle = new Circle(5.55, 7.25);
        System.out.println("circle " + circle.getRadius());
        System.out.println("circle " + circle.getHeight());
        System.out.println("circle " + circle.getArea());
        System.out.println("circle " + circle.getVolume());

    }
}
