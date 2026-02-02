public class Task10 {

    public int sumOfSumOfDigits(int input1) {
        String num = String.valueOf(input1);
        int totalSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentSum = 0;
            for (int j = i; j < num.length(); j++) {
                currentSum += num.charAt(j) - '0';
            }
            totalSum += currentSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Task10 obj = new Task10();

        int input = 123;
        int result = obj.sumOfSumOfDigits(input);

        System.out.println("Sum of Sum of Digits = " + result);
    }
}
