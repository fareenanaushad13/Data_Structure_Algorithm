import java.util.*;
public class MoveZeroes{
    public static void moveZeroes(int[] nums){
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j] = 0;
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        System.out.println("After moving zeroes:");
        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}