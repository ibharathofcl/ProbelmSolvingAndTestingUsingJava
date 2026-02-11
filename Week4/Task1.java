import java.util.*;

public class Task1 {

    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                countA++;
            }
        }

        for (int i = mid; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                countB++;
            }
        }

        return countA == countB;
    }

    // Helper method to check vowel
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        boolean result = halvesAreAlike(s);
        System.out.println("Output: " + result);

        sc.close();
    }
}