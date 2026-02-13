import java.util.*;

public class Task4 {

    public static int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        int minCurrent = nums[0];
        int minGlobal = nums[0];

        totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            totalSum += nums[i];

            // Kadane for maximum
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);

            // Kadane for minimum
            minCurrent = Math.min(nums[i], minCurrent + nums[i]);
            minGlobal = Math.min(minGlobal, minCurrent);
        }

        // If all numbers are negative
        if (maxGlobal < 0) {
            return maxGlobal;
        }

        return Math.max(maxGlobal, totalSum - minGlobal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maxSubarraySumCircular(nums));

        sc.close();
    }
}