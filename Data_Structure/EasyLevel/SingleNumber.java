public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2};

        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            System.out.println(result + " ^ " + nums[i]);

            result = result ^ nums[i];

            System.out.println("Result = " + result);
            System.out.println();
        }

        System.out.println("Final Answer = " + result);
    }
}