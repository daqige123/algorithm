package others;
import java.util.*;
public class 区间合并 {

    public int[][] merge(int[][] intervals) {
        if (intervals[0].length == 0) return intervals;
        int n = intervals.length;
        // ArrayList<ArrayList<Integer>> res = ArrayList<>();
        int res[][] = new int[n][2];
        Arrays.sort(intervals, (a,b) ->a[0]- b[0]);
        // for (int i = 0; i < intervals.length; i++) {
        //     System.out.println(intervals[i][0]+" "+ intervals[i][1]);
        // }
        res[0] = intervals[0];
        int j = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > res[j][1]) {
                res[++j] = intervals[i];
            } else {
                if (intervals[i][1] >= res[j][1]) {
                    res[j][1] = intervals[i][1];
                }
            }
        }
        int[][] result = new int[j+1][2];
        for (int i = 0; i <= j; i++) {
            result[i] = res[i];
        }
        return result;
    }
}
