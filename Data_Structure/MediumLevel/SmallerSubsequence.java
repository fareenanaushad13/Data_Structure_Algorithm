import java.util.Scanner;
import java.util.Stack;

public class SmallerSubsequence {
    public static String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        boolean[] visited = new boolean[26];

        // Store last occurrence of every character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Skip if already in stack
            if (visited[ch - 'a']) {
                continue;
            }

            // Remove larger characters if they appear later
            while (!stack.isEmpty()
                    && ch < stack.peek()
                    && lastIndex[stack.peek() - 'a'] > i) {

                visited[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();
        for (char c : stack) {
            ans.append(c);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String:");
        String s = sc.next();

        System.out.println("Smallest Subsequence: " + smallestSubsequence(s));

        sc.close();
    }
}