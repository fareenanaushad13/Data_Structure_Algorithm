import java.util.*;

public class HammingWeight {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1; 
        }

        System.out.println("Number of set bits (Hamming Weight): " + count);
    }
}
