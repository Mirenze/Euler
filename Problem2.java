import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mirenze on 7/26/2015.
 */
public class Problem2 {
    public static void main(String[] args) {
        List<Integer> fib = new ArrayList<Integer>();
        fib.add(1);
        fib.add(2);

        calculateFib(4000000, fib);
        System.out.println(calculateSum(4000000, fib));
    }

    public static int calculateSum(int maxFib, List<Integer> fib) {
        if (maxFib == 1) {
            return 0;
        }
        if (maxFib == 2) {
            return 2;
        }
        int current;
        int sum = 2;
        int i = 2;

        while (i < fib.size() && (current = fib.get(i)) <= maxFib) {
            if (current % 2 == 0) {
                sum += current;
            }
            i++;
        }

        return sum;
    }

    public static void calculateFib(int maxFib, List<Integer> fib) {
        int current = fib.get(0) + fib.get(1);
        int i = 2;

        while (current <= maxFib) {
            // calculate next number in Fibonacci sequence and add to list
            current = fib.get(i - 1) + fib.get(i - 2);
            fib.add(current);

            i++;
        }
    }
}
