public class MinDeletion{
    public static int minimumDeletion(int[] nums){
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;

        // Find minimum and maximum indices

        for(int i=1;i<n;i++){
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }

            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }

        //remove both from front
        int front = Math.max(minIndex, maxIndex)+1;

        //remove both from back
        int back = n - Math.min(minIndex,maxIndex);

        // One from front and one from back //both

        int both = Math.min(minIndex,maxIndex) + 1  
                   + 
                   n - Math.max(minIndex,maxIndex);

        return Math.min(front, Math.min(back,both));
    }

    public static void main(String[] args) {
        int nums[] = {2,10,7,5,4,1,8,6};

        int result = minimumDeletion(nums);

        System.out.println("Removing min & max from arr = " + result);
    }
}