import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mirenze on 8/1/2015.
 */
public class Problem4Test {
    Problem4 myClass;

    @Before
    public void setUp() throws Exception {
        myClass = new Problem4();
    }

    @Test
    public void testIsPalindrome() throws Exception {
        assertEquals("1 should return true.", true, myClass.isPalindrome(1));
        assertEquals("12 should return false.", false, myClass.isPalindrome(12));
        assertEquals("777 should return true.", true, myClass.isPalindrome(777));
        assertEquals("7777 should return true.", true, myClass.isPalindrome(7777));
        assertEquals("124282421 should return true.", true, myClass.isPalindrome(124282421));
    }

    @Test
    public void testLargestPalindromeProduct() throws Exception {
        assertEquals("Range of 10 and 99 should return 9009.", 9009, myClass.largestPalindromeProduct(10, 99));
        assertEquals("Range of 100 and 999 should return 9009.", 906609, myClass.largestPalindromeProduct(100, 999));

    }
}