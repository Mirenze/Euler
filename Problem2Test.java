import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mirenze on 7/27/2015.
 */
public class Problem2Test {

    Problem2 myClass;
    List<Integer> fib;

    @Before
    public void setUp() throws Exception {
        myClass = new Problem2();
        fib = new ArrayList<Integer>();
        fib.add(1);
        fib.add(2);
        myClass.calculateFib(4000000, fib);
    }

    @Test
    public void testGenerateFib() throws Exception {
        // unit tests
        assertEquals("Max of 1 should return 0", 0, myClass.calculateSum(1, fib));
        assertEquals("Max of 2 should return 2", 2, myClass.calculateSum(2, fib));
        assertEquals("Max of 10 should return 10", 10, myClass.calculateSum(10, fib));
        assertEquals("Max of 90 should return 44", 44, myClass.calculateSum(90, fib));
        assertEquals("Max of 4000000 should return 4613732", 4613732, myClass.calculateSum(40000000, fib));
    }
}