import java.util.*;

public class Task2 {

    public static int birthday(int[] s, int d, int m) {
        int count = 0;

        // Check every subarray of length m
        for (int i = 0; i <= s.length - m; i++) {
            int sum = 0;

            for (int j = i; j < i + m; j++) {
                sum += s[j];
            }

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        int n = sc.nextInt();
        int[] s = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        // Input d (birth day) and m (birth month)
        int d = sc.nextInt();
        int m = sc.nextInt();

        int result = birthday(s, d, m);

        System.out.println(result);

        sc.close();
    }
}