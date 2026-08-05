import java.util.*;

public class FindMissingElement{
    public static List<Integer> missingIntegerRange(int[] nums){
        List<Integer> ans = new ArrayList<>();

        int min = nums[0];
        int max = nums[0];

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        for(int i=min;i <= max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        List<Integer> result = missingIntegerRange(nums);

        System.out.println("Missing Element :" +  result);
        sc.close();
    }
}


