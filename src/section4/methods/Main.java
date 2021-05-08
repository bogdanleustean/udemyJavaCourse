package section4.methods;

public class Main {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 1000, 8, 200);
        System.out.println(highScore + " este rezultatul");

        int highScorePosition = calculteHighScore(1500);
        displayHighScorePosition("tim", highScorePosition);

        highScorePosition = calculteHighScore(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculteHighScore(400);
        displayHighScorePosition("tod", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    //chalenge 1
    public static void displayHighScorePosition(String playerNane, int position) {
        System.out.println(playerNane + " managed to get into position "
                + position + " on the high score table");
    }

    public static int calculteHighScore(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
            return 4;
        }
    }

