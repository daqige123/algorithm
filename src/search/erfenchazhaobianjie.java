package search;

public class erfenchazhaobianjie {
    public int erfencha (int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid, left = 0, right = 0;
        while (low <= high) {
            mid = (high + low)/2;
            if(nums[mid] >= target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        left = high;
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            mid = (high + low)/2;
            if(nums[mid] <= target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        right = low;
        return right -left - 1;

    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 2, 3, 4, 6};
        erfenchazhaobianjie er = new erfenchazhaobianjie();
        int res = er.erfencha(a, 4);
        System.out.println(res);
    }

}
