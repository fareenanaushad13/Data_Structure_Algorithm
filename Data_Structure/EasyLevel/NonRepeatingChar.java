public class NonRepeatingChar{
  static char nonRepeatingChar(String s) {
        int[] freq = new int[26]; 

        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

      
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

      
        return '$';  //print -1
    }
    public static void main(String[] args) {
        System.out.println(NonRepeatingChar.nonRepeatingChar("farfarru"));
    }
}