package section7.encapsulation;

public class MainPlayer {
    public static void main(String[] args) {
//        Player player = new Player();
//       // player.name = "Tim";
//        player.health = 20;
//        player.weapon = "sword";
//int damage = 10;
//player.loseHealth(damage);
//        System.out.println("remaining health ="+ player.healthRemaining());
//damage = 11;
//player.health = 200;
//player.loseHealth(damage);
//        System.out.println(" rema = "+ player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer( "tim", 50, "knife");
        System.out.println("initial health " + player.getHithPoint());
    }
}
