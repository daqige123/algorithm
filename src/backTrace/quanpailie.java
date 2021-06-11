package backTrace;

import java.util.*;

public class quanpailie {
    public static ArrayList<ArrayList<Integer>> permite(int[] nums) {
        ArrayList<ArrayList<Integer>> res  = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        dfs(nums, path, res);
        return res;
    }
    public static void dfs(int[] nums, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(path);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, path, res);
            path.remove(path.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> res = permite(arr);
        System.out.println(res);
    }
}
