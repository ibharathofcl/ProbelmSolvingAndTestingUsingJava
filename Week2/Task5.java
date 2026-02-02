import java.util.Scanner;

public class Task5 {

    public int isPalindrome(String input1) {

        int left = 0;
        int right = input1.length() - 1;
        input1 = input1.toLowerCase();

        while (left < right) {
            if (input1.charAt(left) != input1.charAt(right)) {
                return 1; // Not a palindrome
            }
            left++;
            right--;
        }
        return 2; // Palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Task5 obj = new Task5();
        int result = obj.isPalindrome(input);

        if (result == 2) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
