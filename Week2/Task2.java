import java.util.Scanner;

interface PerformOperation {
    boolean check(int a);
}

public class Task2 {

    // Check if number is odd
    public static PerformOperation isOdd() {
        return i -> i % 2 != 0;
    }

    // Check if number is prime
    public static PerformOperation isPrime() {
        return i -> {
            if (i == 2)
                return true;
            if (i <= 1 || i % 2 == 0)
                return false;

            int numberSqrt = (int) Math.sqrt(i);
            for (int j = 3; j <= numberSqrt; j += 2) {
                if (i % j == 0)
                    return false;
            }
            return true;
        };
    }

    // Check if number is palindrome
    public static PerformOperation isPalindrome() {
        return i -> {
            String numberStr = String.valueOf(i);
            String reversedStr = "";

            for (int j = numberStr.length() - 1; j >= 0; j--) {
                reversedStr += numberStr.charAt(j);
            }
            return numberStr.equals(reversedStr);
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println("Is Odd: " + isOdd().check(number));
        System.out.println("Is Prime: " + isPrime().check(number));
        System.out.println("Is Palindrome: " + isPalindrome().check(number));

        sc.close();
    }
}
