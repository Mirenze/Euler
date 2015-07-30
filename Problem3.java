/**
 * Created by Mirenze on 7/29/2015.
 */
public class Problem3 {
    public static void main(String[] args) {
        System.out.println(isPrime(99));
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
