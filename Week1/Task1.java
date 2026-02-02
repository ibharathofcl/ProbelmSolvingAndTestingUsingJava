import java.util.*;

public class Task1 {

    public static int isEven(int input1) {
        if (input1 % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = isEven(num);

        if (result == 2)
            System.out.println("Even Number (Return Value: 2)");
        else
            System.out.println("Odd Number (Return Value: 1)");

        sc.close();
    }
}