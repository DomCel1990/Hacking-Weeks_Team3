package Test;

import main.Game;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GameTest {

    @Test
    void testGreaterThan(){
        Game g = new Game(10,20);
        Game g1 = new Game(10,15);
        assertTrue(g.compareTo(g1)>0);
    }
    @Test
    void testLessThan(){
        Game g = new Game(10,20);
        Game g1 = new Game(10,15);
        assertTrue(g1.compareTo(g)<0);
    }
    @Test
    void testEquality(){
        Game g = new Game(10,20);
        Game g1 = new Game(10,15);
        assertTrue(g.compareTo(g1)==0);
    }


}
