import java.util.*;

public class MaxProductTwoElements {
    public static int MaxProduct(int[] nums){
        int max1 = 0;
        int max2 = 0;

        for(int num : nums){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }else if(num > max2){
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int result = MaxProduct(nums);

        System.out.println("Maximum Product of Two Elements = " + result);

        sc.close();
    }
    
}