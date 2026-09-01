import java.util.*;

public class CombinationSum11 {
    public static List<List<Integer>> combinationSum2(
            int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private static void backtrack(
            int[] candidates,
            int target,
            int start,
            List<Integer> current,
            List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            // Stop if number is greater than target

            if(candidates[i] > target){
                break;
            }

            current.add(candidates[i]);

            // Explore
            backtrack(
                candidates,
                target - candidates[i],
                i + 1,
                current,
                result
            );

            //remove
            current.remove((current.size()-1));
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = combinationSum2(candidates, target);

        System.out.println(result);
    }

}