import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mirenze on 8/4/2015.
 */
public final class Problem7 {
    public static void main(String[] args) {
        System.out.println(nthPrime(10001));
    }

    public static int nthPrime(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        int current = 2;

        while (primes.size() < n) {
            // could potentially be prime
            if (!isDivisibleByPrime(current, primes)) {
                if (isPrime(current)) {
                    primes.add(current);
                }
            }
            current++;
        }

        return primes.get(primes.size() - 1);
    }

    // return true if num is divisible by any element in provided list of primes
    public static boolean isDivisibleByPrime(int num, List<Integer> primes) {
        for (int prime : primes) {
            if (num % prime == 0) {
                return true;
            }
        }
        return false;
    }

    // return true if num is prime, false otherwise
    public static boolean isPrime(int num) {
        if (num % 2 == 0 && num != 2 || num <= 1) {
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
