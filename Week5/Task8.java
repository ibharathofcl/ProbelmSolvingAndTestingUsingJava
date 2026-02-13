import java.util.*;

public class Task8 {

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private static boolean matches(String word, String pattern) {
        if (word.length() != pattern.length())
            return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (map1.containsKey(w) && map1.get(w) != p)
                return false;

            if (map2.containsKey(p) && map2.get(p) != w)
                return false;

            map1.put(w, p);
            map2.put(p, w);
        }

        return true;
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

        System.out.println("Enter pattern:");
        String pattern = sc.nextLine();

        List<String> result = findAndReplacePattern(words, pattern);

        System.out.println("Matching words:");
        for (String word : result) {
            System.out.println(word);
        }

        sc.close();
    }
}