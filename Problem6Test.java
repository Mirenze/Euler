import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mallory on 8/4/2015.
 */
public class Problem6Test {
    Problem6 myClass;

    @Before
    public void setUp() throws Exception {
        myClass = new Problem6();
    }

    @Test
    public void testSumOfSquares() throws Exception {
        assertEquals("Input of 0 should return 0.", 0, myClass.sumOfSquares(0));
        assertEquals("Input of 1 should return 1.", 1, myClass.sumOfSquares(1));
        assertEquals("Input of 5 should return 55.", 55, myClass.sumOfSquares(5));
        assertEquals("Input of 10 should return 385.", 385, myClass.sumOfSquares(10));
    }

    @Test
    public void testSquareOfSum() throws Exception {
        assertEquals("Input of 0 should return 0.", 0, myClass.squareOfSum(0));
        assertEquals("Input of 1 should return 1.", 1, myClass.squareOfSum(1));
        assertEquals("Input of 10 should return 3025.", 3025, myClass.squareOfSum(10));
    }
}