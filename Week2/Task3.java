import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void miniMaxSum(List<Integer> arr) {
        long sum = arr.stream()
                .mapToLong(Integer::longValue)
                .sum();

        int min = Collections.min(arr);
        int max = Collections.max(arr);

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        miniMaxSum(arr);
    }
}
