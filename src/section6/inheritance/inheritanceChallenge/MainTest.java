package section6.inheritance.inheritanceChallenge;

public class MainTest {
    public static void main(String[] args) {
        Audi audi = new Audi(36);
        audi.steer(45);
        audi.accelerate(30);
        audi.accelerate(20);
        audi.accelerate(-42);
    }
}
