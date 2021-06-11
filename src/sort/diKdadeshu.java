package sort;

public class diKdadeshu {

    public static int quickSort(int arr[], int left, int right) {
        if (left < right){
        int pivot = arr[left];

        while (left < right) {
            while (left < right && arr[right] <= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] >= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        }
        return left;
    }

    public static int erfen(int nums[], int low, int high, int K) {

        if (low <= high) {
            int position = quickSort(nums, low, high);
            if (K == position + 1) {
                System.out.println("zheshi1 fanhui1de1 position " + position);
                return nums[position];
            }
            else if(K < position + 1) {
                return erfen(nums, low, position - 1, K);
            }
            else if (K > position + 1) {
                return erfen(nums,position + 1, high, K);
            }
        }
        return -1;
    }



    public static void  main(String[] args) {
        int nums[] = {10,11, 1, 2, 3, 4, 5, 6,7};
        int K = 3;   // 986578
        int n = nums.length -1;
        //int[] nums = {1, 2, 3, 4, 5, 6, 7};
        //int k = 5;
        System.out.println(erfen(nums, 0, n, K));

    }

}
