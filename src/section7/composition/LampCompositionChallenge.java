package section7.composition;

public class LampCompositionChallenge {
 private String style;
 private boolean battery;
 private int gloRating;

    public LampCompositionChallenge(String style, boolean battery, int gloRating) {
        this.style = style;
        this.battery = battery;
        this.gloRating = gloRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> turn on");

    }
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGloRating() {
        return gloRating;
    }
}
