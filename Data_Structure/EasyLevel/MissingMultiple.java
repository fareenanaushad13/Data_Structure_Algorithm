public class MissingMultiple{
    public static int missingMultiple(int nums[], int k){
        int multiple = k;

        while(true){
            boolean found = false;

            for(int num : nums){
                if(num == multiple){
                    found = true;
                    break;
                }
            }

            if(!found){
                return multiple;
            }

            multiple += k;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,6,1,8,2,5,6,4};
        int k =2;
        
        int ans = missingMultiple(nums, k);
        System.out.println("Smallest Missing multiple of k = "  + ans);
    }
}