import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> res = new HashSet<>();

        for(int i = 0;i< nums.length;i++){
            for(int j = 0; j< nums.length;j++){
                if(i==j){
                    continue;
                }

                int twoSum = nums[i]+nums[j];
                if(twoSum == target){
                  res.add(i);
                  res.add(j);
                }
            }
        }

        Integer[] arr = res.toArray(new Integer[0]);
        int[] intArr = new int[res.size()];
        for(int i = 0;i<arr.length;i++){
            intArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

}
