import java.util.*;

public class Permutation{
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(
        int[] nums,
        List<Integer> current,
        List<List<Integer>> result
    ){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])){
                continue;
            }

            current.add(nums[i]);

            backtrack(nums, current, result);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = permute(nums);

        System.out.println(result);

        sc.close();
    }
}