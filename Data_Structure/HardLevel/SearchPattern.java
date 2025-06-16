import java.util.ArrayList;

public class SearchPattern {
     ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        
        for(int i=0;i<=n-m;i++){
            String sub = txt.substring(i, i+m);
            if(sub.equals(pat)){
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String txt = "aabaacaadaabaaba";
        String pat = "aaba";

        SearchPattern sp = new SearchPattern();
        ArrayList<Integer> result = sp.search(pat, txt);

        System.out.println(result);
    }
}
