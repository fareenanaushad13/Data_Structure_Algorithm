import java.util.*;
public class LexicographicalOrder {
     public static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        int curr = 1;

        for (int i = 0; i < n; i++) {
            result.add(curr);

            if (curr * 10 <= n) {
                curr *= 10;
            } else {
                while (curr % 10 == 9 || curr + 1 > n) {
                    curr /= 10;
                }
                curr++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 13;
        List<Integer> output = lexicalOrder(n);
        System.out.println("Lexicographical Order: " + output);
    }
}
