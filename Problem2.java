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

        System.out.println(generateFib(4000000, fib));
    }

    static int generateFib(int max, List<Integer> fib) {
        int current = fib.get(0) + fib.get(1);
        int sum = 2;
        int index = 2;

        while (current < max) {
            // calculate next number in Fibonacci sequence and add to list
            current = fib.get(index - 1) + fib.get(index - 2);
            fib.add(current);

            // add current number to sum if even
            if (current % 2 == 0) {
                sum += current;
            }

            index++;
        }

        return sum;
    }
}
