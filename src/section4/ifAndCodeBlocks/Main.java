package section4.ifAndCodeBlocks;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int scoreTwo = 10000;
        int levelCompleted = 5;
        int levelCompletedTwo = 8;
        int bonus = 100;
        int bonusTwo = 200;
        if (gameOver ) {
          int finalScore = score +( levelCompleted * bonus);
            System.out.println(finalScore);
            int finalScoreTwo = scoreTwo + (levelCompletedTwo*bonusTwo);
            System.out.println(finalScoreTwo);
        }
    }
}