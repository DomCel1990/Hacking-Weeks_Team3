import main.Game;
import main.League;
import main.Player;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class LeagueTest {

    /**
     * @author Giuseppe Corrao
     */

    @Test
    void isPromotableTestisTrue() {
        Game game1 = new Game(3, 50);
        Game game2 = new Game(5, 80);
        Player player1 = new Player("giuseppe", List.of(game1, game2), League.GOLD);


        assertTrue(player1.getLeague().isPromotable(player1) == true);
    }

    @Test
    void isPromotableTestIsFalse() {
        Game game1 = new Game(3, 10);
        Game game2 = new Game(5, 20);
        Player player1 = new Player("giuseppe", List.of(game1, game2), League.GOLD);


        assertTrue(player1.getLeague().isPromotable(player1) == false);
    }

    @Test
    void isDemotableTestIsTrue() {
        Game game1 = new Game(3, 10);
        Game game2 = new Game(5, 20);
        Player player1 = new Player("giuseppe", List.of(game1, game2), League.GOLD);


        assertTrue(player1.getLeague().isDemotable( player1) == true);

    }

    @Test
    void isDemotableTestIsFalse() {
        Game game1 = new Game(3, 52);
        Game game2 = new Game(5, 50);
        Player player1 = new Player("giuseppe", List.of(game1, game2), League.GOLD);


        assertTrue(player1.getLeague().isDemotable( player1) == false);
    }
}
