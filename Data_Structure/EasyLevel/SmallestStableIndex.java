public class SmallestStableIndex{
     public static int smallestStableIndex(int[] nums, int k) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            int max = nums[0];

            for(int j=0;j<=i;j++){
                max = Math.max(max, nums[j]);
            }

            int min = nums[i];

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }
            int score = max - min;
            if(score<=k){
                return i;
            }

        }
        return -1;
     }

     public static void main(String[] args) {
        int[] nums = {5, 0, 1, 4};
        int k = 3;

        int answer = smallestStableIndex(nums, k);

        System.out.println(answer);
     }
}