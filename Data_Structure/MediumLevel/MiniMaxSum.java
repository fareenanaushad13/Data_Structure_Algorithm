import java.util.Scanner;

public class MiniMaxSum {

    public static void miniMaxSum(int[] arr) {
        long total = 0;
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            total += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println("Minimum Sum = " + minSum);
        System.out.println("Maximum Sum = " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        miniMaxSum(arr);

        sc.close();
    }
}