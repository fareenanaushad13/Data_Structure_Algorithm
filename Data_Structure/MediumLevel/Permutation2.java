import java.util.*;

public class Permutation2{
     static void backtrack(
            int[] nums,
            boolean[] used,
            List<Integer> current,
            List<List<Integer>> result) {

        // If we have used all numbers
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try every number
        for (int i = 0; i < nums.length; i++) {

            // Already used?
            if (used[i]) {
                continue;
            }

            // Skip duplicate
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // Choose
            used[i] = true;
            current.add(nums[i]);

            // Move to next position
            backtrack(nums, used, current, result);

            // Undo
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        // Sort so duplicates come together
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>(), result);

        System.out.println(result);
    }
}

