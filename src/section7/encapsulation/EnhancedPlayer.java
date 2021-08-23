package section7.encapsulation;

public class EnhancedPlayer {
    private String name;
    private int hithPoint = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hithPoint, String weapon) {
        this.name = name;
        if(hithPoint > 0 && hithPoint <= 100){
            this.hithPoint = hithPoint;
        }
        this.weapon = weapon;
    }

    public void loseHealth( int damage){
        this.hithPoint = this.hithPoint -damage;
        if(this.hithPoint <= 0){
            System.out.println("player knocked out");
            // reduce number of lives remaining for the player
        }
    }
    public int getHithPoint() {
        return hithPoint;
    }
}
