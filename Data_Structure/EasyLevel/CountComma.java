import  java.util.*;
public class CountComma{
    public static long countComma(int n){
        if(n<1000){
            return 0;
        }
        return n - 999;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long result = countComma(n);
        System.err.println("Count Commas in range = " + result);
        sc.close();
    }
}