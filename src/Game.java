/**
 * @author Emilio Fagiani
 */
// A class Game that implements Comparable
public class Game implements Comparable<Game> {

    private int enemies;
    private int score;

    // Constructor
    public Game(int enemies, int score) {
        this.enemies = enemies;
        this.score = score;
    }

    public int getEnemies() {
        return enemies;
    }

    public void setEnemies(int enemies) {
        this.enemies = enemies;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getFinalScore() {
        return enemies * score;
    }

    // CompareTo methods for compare the final score
    @Override
    public int compareTo(Game g) {
        int thisFinalScore = getFinalScore();
        int otherFinalScore = g.getFinalScore();

        return thisFinalScore - otherFinalScore;
    }
    @Override
    public String toString() {
        return "Enemies: " + enemies + "\n"+
                "Score: " + score;
    }

}

