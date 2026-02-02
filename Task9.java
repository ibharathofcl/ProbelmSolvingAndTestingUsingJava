public class Task9 {

    static int isPalinNum(int input1) {
        int temp = input1;
        int rev = 0;

        while (input1 > 0) {
            rev = rev * 10 + input1 % 10;
            input1 /= 10;
        }

        if (rev != temp)
            return 1; // Not Palindrome
        return 2; // Palindrome
    }

    public static void main(String[] args) {
        int number = 121; // change number to test

        int result = isPalinNum(number);
        System.out.println(result);
    }
}