public class Task8 {

    public static long nthFibonacci(int input1) {
        int a = 0;
        int b = 1;
        int c = 0;
        int d = 3;

        while (d <= input1) {
            c = a + b;
            a = b;
            b = c;
            d++;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 6; // change n to test

        long result = nthFibonacci(n);
        System.out.println(result);
    }
}