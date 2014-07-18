import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void shouldReturnZeroWhenYouSuckAtBowling() {
        roll(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void shouldReturnTwentyWhenYouSuckLessAtBowling() {
        roll(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void shouldBeAbleToCatchASpare(){
        rollSpare();
        game.roll(3);
        roll(17,0);

        assertEquals(16, game.score());
    }

    @Test
    public void shouldBeAbleToHandleAStrike(){
        rollStrike();
        game.roll(3);
        game.roll(4);
        roll(16, 0);

        assertEquals(24, game.score());
    }

    @Test
    public void shouldHandlePerfectGame(){
        roll(12, 10);

        assertEquals(300, game.score());
    }

    private void rollStrike() {
        game.roll(10);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void roll(int numberOfRolls, int scoreOfRoll) {
        for (int roll = 0; roll < numberOfRolls; roll++) {
            game.roll(scoreOfRoll);
        }
    }
}
