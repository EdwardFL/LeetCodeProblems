import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] array = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(array);
        for(List<Integer> insideList : list) {
            System.out.println(insideList.toString());
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> tripletList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((i != j) && (i != k) && (j != k) && (nums[i] + nums[j] + nums[k] == 0)) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        tripletList.add(list);
                    }
                }
            }
        }
        return tripletList;
    }

}