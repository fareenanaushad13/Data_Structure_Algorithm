import java.util.Arrays;

public class MinimizeTheHeights {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 10};
        int k1 = 2;
        System.out.println(getMinDiff(arr1, k1));

        int[] arr2 = {3, 9, 12, 16, 20};
        int k2 = 3;
        System.out.println(getMinDiff(arr2, k2));
    }

    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;

        if (n == 1) {
            return 0;
        }

        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);

            if (min < 0) continue;

            ans = Math.min(ans, max - min);
        }

        return ans;
    }
}
