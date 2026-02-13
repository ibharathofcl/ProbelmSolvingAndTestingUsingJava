import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // -------- Maximum Subarray (Kadane’s Algorithm) --------
            int maxCurrent = arr[0];
            int maxGlobal = arr[0];

            for (int i = 1; i < n; i++) {
                maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
                maxGlobal = Math.max(maxGlobal, maxCurrent);
            }

            // -------- Maximum Subsequence --------
            int maxSubsequence = 0;
            int maxElement = arr[0];

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    maxSubsequence += arr[i];
                }
                maxElement = Math.max(maxElement, arr[i]);
            }

            // If all elements are negative
            if (maxSubsequence == 0) {
                maxSubsequence = maxElement;
            }

            System.out.println(maxGlobal + " " + maxSubsequence);
        }

        sc.close();
    }
}