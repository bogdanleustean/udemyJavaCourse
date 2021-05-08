package section4.methodOverloading;

public class Main {
    public static void main(String[] args) {

       //int newScore = calculateScore("NewScore", 400);
       // System.out.println(newScore + " method");
       // calculateScore(75);
       // calculateScore();
      //  MinutesToYearsAndDaysCalculator.printYearsAndDays(6980000);
    }
    // overloading same method with different params
   public static int calculateScore(String playerName, int score){
       System.out.println("Player "+ playerName+ " score"
               + score + " points");
       return score * 10;
   }

    public static int calculateScore( int score){
        System.out.println("Unnamed player scored "
                + score + " points");
        return score * 10;
  }
    public static int calculateScore( ){
        System.out.println("No player, no player scored");
        return 0;
    }
}
