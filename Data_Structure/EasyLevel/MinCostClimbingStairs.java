import java.util.*;

public class MinCostClimbingStairs{
    static int[] dp;

    public static int minCostClimbingStairs(int[] cost){
        dp = new int[cost.length];
    Arrays.fill(dp,-1);

    return Math.min(solve(cost,0),solve(cost,1));
    }

    public static int solve(int[] cost, int i){
        if(i>=cost.length){
            return 0;
        }

        if(dp[i] !=-1){
            return dp[i];
        }

        dp[i] = cost[i] + Math.min(solve(cost, i+1),solve(cost, i+2));

        return dp[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs:");
        int n = sc.nextInt();

        int cost[] = new int[n];

        System.out.println("Enter cost of each stairs:");

        for(int i=0;i<n;i++){
            cost[i] = sc.nextInt();
        }

        System.out.println("Minimum Cost:" + minCostClimbingStairs(cost));

        sc.close();
    }
    
}

