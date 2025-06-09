public  class MaxCircularSubArraySum {
    public static int kadaneMax(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static int kadaneMin(int[] arr) {
        int minEndingHere = arr[0];
        int minSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            minEndingHere = Math.min(arr[i], minEndingHere + arr[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }

        return minSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {10, -3, -4, 7, 6, 5, -4, -1}; 

        int totalSum = 0;
        int maxSum = kadaneMax(arr);
        int minSum = kadaneMin(arr);

        for (int num : arr) {
            totalSum += num;
        }

        int result = (totalSum == minSum) ? maxSum : Math.max(maxSum, totalSum - minSum);
        System.out.println("Maximum Circular Subarray Sum: " + result);
    }
}
