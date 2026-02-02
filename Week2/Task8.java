public class Task8 {

    public int totalHillWeight(int input1, int input2, int input3) {
        int sum = 0;

        for (int i = 0; i < input1; i++) {
            for (int j = 0; j <= i; j++) {
                sum += input2;
            }
            input2 = input2 + input3;
        }

        return sum;
    }

    public static void main(String[] args) {
        Task8 obj = new Task8();

        // Sample inputs
        int input1 = 3;
        int input2 = 2;
        int input3 = 1;

        int result = obj.totalHillWeight(input1, input2, input3);

        System.out.println("Total Hill Weight = " + result);
    }
}
