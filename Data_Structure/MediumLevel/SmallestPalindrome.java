import java.util.*;

public class SmallestPalindrome {

    public static String smallestPalindrome(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        String middle = "";

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) (i + 'a'));
            }

            if (freq[i] % 2 == 1) {
                middle = String.valueOf((char) (i + 'a'));
            }
        }

        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle + right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a palindrome string: ");
        String s = sc.nextLine();

        System.out.println("Smallest Palindrome: " + smallestPalindrome(s));

        sc.close();
    }
}
