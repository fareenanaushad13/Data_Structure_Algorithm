import java.util.ArrayList;
import java.util.List;

public class CombinationSum{
    static List<List<Integer>> result = new ArrayList<>();

    static void backtrack(int[] candidates, int target,int index, List<Integer>current){
        //targated reached
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        //targated crossed
        if(target < 0){
            return;
        }

        for(int i= index; i< candidates.length;i++){
            current.add(candidates[i]);

            //explore
            backtrack(candidates, target - candidates[i], i, current);

            //backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;

        backtrack(candidates, target, 0, new ArrayList<>());

        System.out.println(result);
    }
}