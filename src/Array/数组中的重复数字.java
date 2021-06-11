package Array;
import java.util.*;
public class 数组中的重复数字 {
    public static void main(String[] args) {

    }
    public static int findRepeatNumber(int[] nums) {
        int i = 0;
         while (i < nums.length) {
             while(i < nums.length && i == nums[i]) {
                 i++;
                 continue;
             }
             if (nums[i]== nums[nums[i]]) return nums[i];
             int temp = nums[i];
             nums[i]  = nums[temp];
             nums[temp] = temp;
         }
        return -1;
    }
}

//class Solution {
//    public int findRepeatNumber(int[] nums) {
//        int i = 0;
//        while(i < nums.length) {
//            if(nums[i] == i) {
//                i++;
//                continue;
//            }
//            if(nums[nums[i]] == nums[i]) return nums[i];
//            int tmp = nums[i];
//            nums[i] = nums[tmp];
//            nums[tmp] = tmp;
//        }
//        return -1;
//    }
//}
