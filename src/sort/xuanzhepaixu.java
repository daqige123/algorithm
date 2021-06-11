package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class xuanzhepaixu {
    void xuanze (int[] nums) {
        int n = nums.length;
        int temp , k;
        for (int i = 0; i < n -1; i++) {
            k = i;
            for(int j = i + 1; j < n; j++) {
                if(nums[k] > nums[j])
                    k = j;
            }
            temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,6,7,8,1,5,6};
        xuanzhepaixu xu = new xuanzhepaixu();
        xu.xuanze(nums);

        System.out.println(Arrays.toString(nums));
    }
}
