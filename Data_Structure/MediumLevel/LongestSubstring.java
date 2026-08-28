import java.util.*;

public class LongestSubstring{
    public static int lengthOfLongestSubstring(String s){
        // Stores characters in the current window
        Set<Character> set = new HashSet<>();

        // Starting point of window
        int left = 0;

        // Stores longest length found
        int maxLength = 0;

        // right moves through the string
        for(int right = 0; right < s.length() ; right++){
            // If current character is already present,
            // remove characters from the left
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            // Add current character
            set.add(s.charAt(right));

            //Calculate current window length
            int currentLength = right - left + 1;

            // Keep the bigger answer
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        int result = lengthOfLongestSubstring(s);
        
        System.out.println("Length of Longest Substring without repeating characters: = " + result);
    }
}