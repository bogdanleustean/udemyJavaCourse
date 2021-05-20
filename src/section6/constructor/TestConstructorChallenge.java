package section6.constructor;

public class TestConstructorChallenge {
    public static void main(String[] args) {

        System.out.println("wall challenge ------->");

        WallAreaChallenge wall = new WallAreaChallenge(5,4);
        System.out.println("area =" + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = "+wall.getWidth());
        System.out.println("height = "+wall.getHeight());
        System.out.println("area = "+ wall.getArea());

        System.out.println("");


    }
}
