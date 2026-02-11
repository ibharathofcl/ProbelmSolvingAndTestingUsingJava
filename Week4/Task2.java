import java.util.*;

public class Task2 {

    public static boolean isLapindrome(String s) {
        int n = s.length();
        int mid = n / 2;

        String firstHalf;
        String secondHalf;

        // If length is even
        if (n % 2 == 0) {
            firstHalf = s.substring(0, mid);
            secondHalf = s.substring(mid);
        }
        // If length is odd (ignore middle character)
        else {
            firstHalf = s.substring(0, mid);
            secondHalf = s.substring(mid + 1);
        }

        int[] freq = new int[26];

        // Count frequency of first half
        for (char c : firstHalf.toCharArray()) {
            freq[c - 'a']++;
        }

        // Subtract frequency of second half
        for (char c : secondHalf.toCharArray()) {
            freq[c - 'a']--;
        }

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        while (T-- > 0) {
            String s = sc.nextLine();

            if (isLapindrome(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}