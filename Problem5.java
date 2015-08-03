/**
 * Created by Mirenze on 8/2/2015.
 */
public class Problem5 {
    public static void main(String[] args) {
        System.out.println(smallestDivisible(1, 20));
    }

    public static int smallestDivisible(int start, int end) {
        int result = end;

        while (!isDivisibleByRange(start, end, result)) {
            result += end;
        }

        return result;
    }

    public static boolean isDivisibleByRange(int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            if (target % i != 0) {
                return false;
            }
        }

        return true;
    }

}
