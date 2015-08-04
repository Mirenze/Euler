import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mirenze on 8/3/2015.
 */
public class Problem5Test {
    Problem5 myClass;

    @Before
    public void setUp() throws Exception {
        myClass = new Problem5();
    }

    @Test
    public void testSmallestDivisible() throws Exception {
        assertEquals("Inputs 1 and 10 should return 2520.", 2520, myClass.smallestDivisible(1, 10));
        assertEquals("Inputs 1 and 20 should return 232792560", 232792560, myClass.smallestDivisible(1, 20));
    }
}