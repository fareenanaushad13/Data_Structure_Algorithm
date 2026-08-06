import java.util.*;
 
public class SmallestNumber{
    public static int smallestNumber(int n, int t){
        int currectNumber = n;

        while(true){
            int temp = currectNumber;
            int product = 1;

            while(temp>0){
                int digit = temp % 10;
                product = product*digit;
                temp = temp/10;
            }
            if(product % t == 0){
                return currectNumber;
            }
            currectNumber++;
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n:");
    int n = sc.nextInt();

    System.out.print("Enter t:");
    int t = sc.nextInt();

    int ans = smallestNumber(n, t);

    System.out.println("Smallest Divisible Digit Product:" + ans);

    sc.close();

   }
}