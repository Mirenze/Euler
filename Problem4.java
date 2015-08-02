/**
 * Created by Mirenze on 8/1/2015.
 */
public class Problem4 {
    public static void main(String[] args) {
        System.out.println(largestPalindromeProduct(100, 999));
    }

    /**
     * Returns the largest palindrome product within a given range.
     * @param start beginning of range
     * @param end   end of range
     * @return      largest palindrome product within given range
     */
    public static int largestPalindromeProduct(int start, int end) {
        int product = 0;

        while (start < end) {
            for (int i = end; i >= start; i--) {
                if (isPalindrome(end * i)) {

                    // adjust range if palindrome found
                    product = end * i > product ? end * i : product;
                    start = i;
                    break;

                }
            }
            end--;
        }

        return product;
    }

    /**
     * Determines whether the input is a palindrome.
     * @param num   number to be tested
     * @return      boolean indicating whether num is a palindrome
     */
    public static boolean isPalindrome(int num) {
        String numToStr = String.valueOf(num);
        int start = 0;
        int end = numToStr.length() - 1;

        while (start < end) {
            if (numToStr.charAt(start) != numToStr.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
