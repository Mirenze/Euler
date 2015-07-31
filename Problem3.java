import java.math.BigInteger;

/**
 * Created by Mirenze on 7/29/2015.
 */
public class Problem3 {
    public static void main(String[] args) {

        BigInteger target = new BigInteger("600851475143");
        System.out.println(largestPrime(target));
    }

    public static int largestPrime(int num) {
        for (int i = num; i > 1; i--) {
            if (num % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return 0;
    }

    public static boolean isPrime(int num) {
        if (num % 2 == 0 && num != 2) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
