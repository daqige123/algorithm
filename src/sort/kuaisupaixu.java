package sort;

import java.util.Arrays;

public class kuaisupaixu {
    public void quick(int[] nums, int left, int right ) {
        if(left <right) {
            int i = left, j = right;
            int prv = nums[i];
            int count = 1;
            while (i < j) {
                while (i < j && nums[j] >= prv) j--;
                if (i < j) nums[i] = nums[j];
                while (i < j && nums[i] <= prv) i++;
                if (i < j) nums[j] = nums[i];
            }
            nums[i] = prv;


            quick(nums, left, i - 1);
            quick(nums, i + 1, right);
        }

        //System.out.println(System);
    }

    // 合并到一起快速排序
  void QuickSort(int array[], int low, int high) {
     if (low < high) {
         int i   = low;
         int j   = high;
         int key = array[i];
         while (i < j) {
             while (i < j && array[j] >= key) {
                 j--;
             }
             if (i < j) {
                 array[i] = array[j];
             }
             while (i < j && array[i] <= key) {
                 i++;
             }
             if (i < j) {
                 array[j] = array[i];
             }
         }
         array[i] = key;
         QuickSort(array, low, i - 1);
         QuickSort(array, i + 1, high);
     }
 }



    public static void main(String[] args) {
        int[] nums = {1, 127, 9, 10, 7, 0, 19, -10, 99};
        int left = 0 , right = nums.length - 1;
        kuaisupaixu kuai = new kuaisupaixu();
        kuai.quick(nums, left, right);
        System.out.println(Arrays.toString(nums));
    }
}
