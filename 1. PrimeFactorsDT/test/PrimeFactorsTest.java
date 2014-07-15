import org.junit.Test;

import static primeFactors.PrimeFactors.generate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    private static List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i : ints) {
            list.add(i);
        }

        return list;
    }

    @Test
    public void shouldReturnAnEmptyList() {
        assertEquals(list(), generate(1));
    }

    @Test
    public void shouldReturnTwoForPrimeOfTwo() {
        assertEquals(list(2), generate(2));
    }

    @Test
    public void shouldReturnThreeForPrimeOfThree() {
        assertEquals(list(3), generate(3));
    }

    @Test
    public void shouldReturnTwoTwoForPrimeOfFour() {
        assertEquals(list(2,2), generate(4));
    }

    @Test
    public void shouldReturnTwoThreeForPrimeOfSix() {
        assertEquals(list(2,3), generate(6));
    }

    @Test
    public void shouldReturnTwoTwoTwoForPrimesOfEight() {
        assertEquals(list(2,2,2), generate(8));
    }

    @Test
    public void shouldReturnThreeThreeForPrimesOfNine(){
        assertEquals(list(3,3), generate(9));
    }
}
