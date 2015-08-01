/**
 * Created by Mirenze on 7/29/2015.
 */
public class Problem3 {
    public static void main(String[] args) {

        long target = 600851475143L;
        System.out.println(largestPrime(target));

    }

    // return largest prime factor of num, -1 if num less than 2
    public static long largestPrime(long num) {
        if (num <= 1) {
            return -1;
        }

        long factor = num;
        long largest = 2;

        // prime factorization
        while (factor != 1) {
            for (int i = 2; i <= factor; i++) {
                if (factor % i == 0) {
                    if (isPrime(i)) {
                        factor /= i;
                        largest = i;
                    }
                }
            }
        }

        return largest;
    }

    // return true if num is prime, false otherwise
    public static boolean isPrime(long num) {
        if (num == 2) {
            return true;
        }

        if (num % 2 == 0 || num <= 1) {
            return false;
        }

        for (long i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
