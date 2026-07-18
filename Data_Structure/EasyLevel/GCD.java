import java.util.*;

public class GCD {
    public static int findGCD(int nums[]){
        int min = nums[0];
        int max = nums[0];

        // Find smallest and largest
        for(int i=1; i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>min){
                max = nums[i];
            }
        }
        //find GCD
        while(max%min !=0){
            int rem = max % min;
            max = min;
            min = rem;
        }
         return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

       System.out.println("GCD = " + findGCD(nums));
    }
}
