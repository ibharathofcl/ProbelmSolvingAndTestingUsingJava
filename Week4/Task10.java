import java.util.*;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(matrix, m, n, r);

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void rotateMatrix(int[][] matrix, int m, int n, int r) {

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            // Top row
            for (int j = layer; j < n - layer; j++)
                elements.add(matrix[layer][j]);

            // Right column
            for (int i = layer + 1; i < m - layer - 1; i++)
                elements.add(matrix[i][n - layer - 1]);

            // Bottom row
            for (int j = n - layer - 1; j >= layer; j--)
                elements.add(matrix[m - layer - 1][j]);

            // Left column
            for (int i = m - layer - 2; i > layer; i--)
                elements.add(matrix[i][layer]);

            int size = elements.size();
            int rotation = r % size;

            // Rotate anti-clockwise
            Collections.rotate(elements, -rotation);

            int index = 0;

            // Put back Top row
            for (int j = layer; j < n - layer; j++)
                matrix[layer][j] = elements.get(index++);

            // Right column
            for (int i = layer + 1; i < m - layer - 1; i++)
                matrix[i][n - layer - 1] = elements.get(index++);

            // Bottom row
            for (int j = n - layer - 1; j >= layer; j--)
                matrix[m - layer - 1][j] = elements.get(index++);

            // Left column
            for (int i = m - layer - 2; i > layer; i--)
                matrix[i][layer] = elements.get(index++);
        }
    }
}