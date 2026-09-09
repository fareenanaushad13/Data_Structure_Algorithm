import java.util.*;

public class Countcommas2{
    public static long countCommas(long n){
        long ans = 0;

        if(n>=1000){
            long count = Math.min(n,999999) - 1000 + 1;
            ans += count;
        }
        if(n>=1000000){
            long count = Math.min(n,999999999) - 1000000 + 1;
            ans += count * 2;
        }
        if(n>=1000000000){
            long count = Math.min(n,999999999999L) - 1000000000 + 1;
            ans += count * 3;
        }
        if(n>=1000000000000L){
            long count = Math.min(n,999999999999999L) - 1000000000000L + 1;
            ans += count * 4;
        }

        if(n>=1000000000000000L){
            ans += 5;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("Count commas in range =" + countCommas(n));

        sc.close();
    }
}