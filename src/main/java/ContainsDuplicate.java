import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
//        //transform value in list to be the map and init each value counter = 0
//        for(int eachNum: nums){
//                numMap.put(eachNum,0);
//        }
//
//        for(Map.Entry<Integer,Integer> numSet: numMap.entrySet()){
//            int counter = 0;
//            for(int eachNum: nums){
//                if(eachNum==numSet.getKey()){
//                    counter++;
//                    if(counter>=2){
//                        return true;
//                    }
//                    numMap.put(eachNum,counter);
//                }
//            }
//        }
//        System.out.println(numMap);
//
//        return false;


        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
