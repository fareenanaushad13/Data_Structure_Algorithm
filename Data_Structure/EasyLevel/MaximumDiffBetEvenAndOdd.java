import java.util.*;

public class MaximumDiffBetEvenAndOdd {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        List<Integer> oddFreqs = new ArrayList<>();
        List<Integer> evenFreqs = new ArrayList<>();

        for (int f : freq) {
            if (f > 0) {
                if (f % 2 == 1) {
                    oddFreqs.add(f);
                } else {
                    evenFreqs.add(f);
                }
            }
        }

        int maxDiff = Integer.MIN_VALUE;
        for (int odd : oddFreqs) {
            for (int even : evenFreqs) {
                maxDiff = Math.max(maxDiff, odd - even);
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        MaximumDiffBetEvenAndOdd sol = new MaximumDiffBetEvenAndOdd();

        String s1 = "aaaaabbc";
        System.out.println("Input: " + s1 + " → Output: " + sol.maxDifference(s1));

        String s2 = "abcabcab";
        System.out.println("Input: " + s2 + " → Output: " + sol.maxDifference(s2));
    }
}
