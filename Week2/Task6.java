import java.util.Scanner;

public class Task6 {

    public int allDigitsCount(int input1) {
        int count = 0;

        while (input1 > 0) {
            count++;
            input1 /= 10;
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        Task6 obj = new Task6();
        int result = obj.allDigitsCount(input);

        System.out.println(result);

        sc.close();
    }
}
