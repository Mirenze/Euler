import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mirenze on 7/31/2015.
 */
public class Problem3Test {

    // class to be tested
    Problem3 myClass;

    @Before
    public void setUp() throws Exception {
        myClass = new Problem3();
    }

    @Test
    public void testLargestPrime() throws Exception {
        assertEquals("1 has no largest prime factor.", -1, myClass.largestPrime(1));
        assertEquals("The largest prime of 2 should be 2.", 2, myClass.largestPrime(2));
        assertEquals("The largest prime of 13195 should be 29.", 29, myClass.largestPrime(13195));
        assertEquals("The largest prime of 600851475143 should be 6857.", 6857, myClass.largestPrime(600851475143L));
    }

    @Test
    public void testIsPrime() throws Exception {
        assertEquals("1 is NOT prime.", false, myClass.isPrime(1));
        assertEquals("2 is prime.", true, myClass.isPrime(2));
        assertEquals("4 is NOT prime.", false, myClass.isPrime(4));
        assertEquals("29 is prime.", true, myClass.isPrime(29));
        assertEquals("13195 is NOT prime.", false, myClass.isPrime(13195));
    }
}