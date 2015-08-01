/**
 * Created by Mirenze on 8/1/2015.
 */
public class Problem4 {
    public static void main(String[] args) {
        // iterate through 100-999 * 100-999
        // check if product is palindrome, if so, check against current largest
        // if larger than current, save that

    }

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
