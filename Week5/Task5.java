import java.util.*;

public class Task6 {

    public static int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // 1️⃣ Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If string becomes empty
        if (i == n)
            return 0;

        // 2️⃣ Check sign
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        // 3️⃣ Convert digits
        long result = 0; // Use long to detect overflow

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;

            // 4️⃣ Handle overflow
            if (sign * result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign * result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(myAtoi(input));

        sc.close();
    }
}