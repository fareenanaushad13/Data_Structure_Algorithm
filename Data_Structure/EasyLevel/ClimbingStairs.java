import java.util.*;
public class ClimbingStairs {

    static int[] dp;

    public static int climbStairs(int n){
        dp = new int[n+1];
        Arrays.fill(dp,-1);

        return solve(n);
        }

        public static int solve(int n){
            if(n==0){
                return 1;
            }

            if(n==1){
                return 1;
            }
            if(dp[n] != -1){
                return dp[n];
            }

            dp[n] = solve(n-1)+solve(n-2);

            return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n:");
        int n = sc.nextInt();

        System.out.println("Climbing Stairs:" + climbStairs(n));

        sc.close();
    }
}
