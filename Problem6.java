/**
 * Created by Mirenze on 8/4/2015.
 */
public final class Problem6 {
    public static void main(String[] args) {
        System.out.println(sumSquareDifference(100));
    }

    public static int sumSquareDifference(int num) {
        return Math.abs(sumOfSquares(num) - squareOfSum(num));
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int squareOfSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum * sum;
    }

}
