import java.util.*;

public class SockMerchant {

    public static int sockMerchant(int n, int[] ar) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int color : ar) {
            map.put(color, map.getOrDefault(color, 0) + 1);
        }

        int pairs = 0;

        for (int count : map.values()) {
            pairs += count / 2;
        }

        return pairs;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of socks: ");
        int n = sc.nextInt();

        int[] ar = new int[n];

        System.out.println("Enter the sock colors:");

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int result = sockMerchant(n, ar);

        System.out.println("Number of pairs: " + result);

        sc.close();
    }
}