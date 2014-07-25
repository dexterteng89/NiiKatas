import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScorerTest {

    Scorer scorer;

    @Before
    public void setUp() {
        scorer = new Scorer();
    }

    private void bowlLots(int numberOfRolls, int score) {
        for (int i = 0; i < numberOfRolls; i++) {
            scorer.bowl(score);
        }
    }

    @Test
    public void shouldBeAbleToScoreABadGame() {
        bowlLots(20, 0);

        assertEquals(0, scorer.score());
    }

    @Test
    public void shouldBeAbleToScoreRollsOfOnes() {
        bowlLots(20, 1);

        assertEquals(20, scorer.score());
    }

    @Test
    public void shouldBeAbleToScoreSpare() {
        scorer.bowl(5);
        scorer.bowl(5);
        scorer.bowl(5);
        bowlLots(17, 0);

        assertEquals(20, scorer.score());
    }

    @Test
    public void shouldBeAbleToScoreAStrike() {
        scorer.bowl(10);
        scorer.bowl(3);
        scorer.bowl(3);
        bowlLots(17, 0);

        assertEquals(22, scorer.score());
    }

    @Test
    public void shouldBeAbleToScoreAPerfectGame(){
        bowlLots(12, 10);

        assertEquals(300, scorer.score());
    }
}
