package section4.methodOverloading;

public class PlayingCatChallenge {
    public static void main(String[] args) {
        System.out.println( isCatPlaying(true, 10));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (temperature >= 25 && temperature <= 35)
        || (summer == true && temperature >= 25 && temperature <=45);
    }
}
