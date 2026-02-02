public class Task2 {

    static int elementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length)
            return -1;
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };

        int index = 3; // try changing this value
        int result = elementAtIndex(arr, index);

        System.out.println(result);
    }
}