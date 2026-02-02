public class Task10 {

    public static int addLastDigits(int input1, int input2) {
        if (input1 < 0)
            input1 = (-1) * input1;
        if (input2 < 0)
            input2 = (-1) * input2;

        return (input1 % 10) + (input2 % 10);
    }

    public static void main(String[] args) {
        int a = 267;
        int b = -154;

        int result = addLastDigits(a, b);
        System.out.println(result);
    }
}