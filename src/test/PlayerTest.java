
import main.Game;
import main.League;
import main.Player;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.AssertJUnit.assertTrue;

/**
 * @author Giuseppe Corrao
 */

public class PlayerTest{

    @Test
    void getAverageScoreTest(){

        Game game1 = new Game(3,2);
        Game game2 = new Game(5,3);
        Player player = new Player("giuseppe",List.of(game1,game2), League.GOLD);

        double average = player.getAverageScore();

        assertTrue(average > 0);
        assertTrue(average == 2.5);

    }
    @Test
    void testGreaterThan(){
        Game game1 = new Game(3,5);
        Game game2 = new Game(5,5);
        Game game3 = new Game(7,5);
        Game game4 = new Game(1,3);
        Player player1 = new Player("giuseppe",List.of(game1,game2), League.GOLD);
        Player player2 = new Player("domenico",List.of(game3,game4), League.GOLD);

        assertTrue(player1.compareTo(player2) > 0);
    }
    @Test
    void testLessThan(){
        Game game1 = new Game(3,1);
        Game game2 = new Game(5,3);
        Game game3 = new Game(7,10);
        Game game4 = new Game(1,3);
        Player player1 = new Player("giuseppe",List.of(game1,game2), League.GOLD);
        Player player2 = new Player("domenico",List.of(game3,game4), League.GOLD);

        assertTrue(player1.compareTo(player2) < 0);
    }
    @Test
    void testEquality(){
        Game game1 = new Game(3,5);
        Game game2 = new Game(5,5);
        Game game3 = new Game(7,5);
        Game game4 = new Game(1,5);
        Player player1 = new Player("giuseppe",List.of(game1,game2), League.GOLD);
        Player player2 = new Player("domenico",List.of(game3,game4), League.GOLD);

        assertTrue(player1.compareTo(player2) == 0);

    }

}
