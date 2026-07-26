import java.util.*;

public class MaxProduct{
    public static int maximumProduct(int[] nums){
        Arrays.sort(nums);

        int n = nums.length;

        int product1 = nums[n-1]*nums[n-2]*nums[n-3];
        int product2 = nums[0]*nums[1]*nums[n-1];

        return Math.max(product1, product2);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maximumProduct(nums);

        System.out.println("Maximum Product = " + result);

        sc.close();
    }

    
}
