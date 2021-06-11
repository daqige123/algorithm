package twopoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sanshuzhihe {

    public static void main(String[] args) {
        int [] nums = {-1, 0, 1, 2, -1, -4};
        // int
    }
    public static List<List<Integer>> threeSum (int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length <= 2) return res;
        Arrays.sort(nums);
        for ( int i = 0; i < nums.length; i ++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i -1]) continue;
            int target = 0 - nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right]  == target) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    right--;
                    left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                } else if(nums[left] + nums[right] > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}
