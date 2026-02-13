import java.util.*;

public class Task9 {

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {

                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // stop checking once found
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of words:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] words = new String[n];

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        List<String> result = stringMatching(words);

        System.out.println("Matching substrings:");
        for (String word : result) {
            System.out.println(word);
        }

        sc.close();
    }
}