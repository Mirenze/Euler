import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mirenze on 8/4/2015.
 */
public final class Problem8 {
    public static void main(String[] args) throws IOException {
        List<Long> num = readFile(new File("Problem8.txt"));
        System.out.println(largestProduct(num, 13));
    }

    public static List<Long> readFile(File file) throws IOException {
        List<Long> result = new ArrayList<Long>();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file),
                        Charset.forName("UTF-8")));


        int c;
        while ((c = reader.read()) != -1) {
            result.add((long) Character.getNumericValue(c));
        }

        return result;
    }

    public static long largestProduct(List<Long> stringToSearch, int adjacent) {
        long largest = 1;
        long current = 1;
        int index = 0;

        while (index < stringToSearch.size() - adjacent) {

            for (int i = index; i < index + adjacent; i++) {
                if (stringToSearch.get(i) == 0) {
                    index = i;
                    break;
                }
                current *= stringToSearch.get(i);
            }
            largest = current > largest ? current : largest;
            current = 1;
            index++;
        }

        return largest;
    }
}