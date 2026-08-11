public class MissingInteger {
    public static int missingInteger(int[] nums){
        int sum = nums[0];

        for(int i=1;i<nums.length;i++){
             if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            }else{
                break;
            }
        }
        int x = sum;
        while (true) {
            boolean found = false;

            for(int num :nums){
                if(num == x){
                    found = true;
                    break;
                }
            }
              if (!found) {
                return x;
            }

            x++;
        }
        }
         public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 12, 14, 13};

        int result = missingInteger(nums);

        System.out.println(result);
    }
}
