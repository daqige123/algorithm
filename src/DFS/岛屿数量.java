package DFS;
import java.util.*;
public class 岛屿数量 {
//    public int daoyushuliang (char grid[][]) {
//        if (grid.length == 0) return 0;
//        int m =  grid.length;
//        int n = grid[0].length;
//        int res = 0;
//        for (int i = 0 ; i < m; i++) {
//            for (int j = 0; j < n; j++ ) {
//                if (grid[i][j] == '1') {
//                    dfs(grid, i, j);
//                    res++;
//
//                }
//            }
//        }
//        return res;
//    }
//
//    public void dfs(char[][] grid, int i, int j){
//        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length-1 || grid[i][j] == '0') return ;
//        grid[i][j] = '0';
//        dfs(grid, i-1, j);
//        dfs(grid, i+1, j);
//        dfs(grid, i, j-1);
//        dfs(grid, i, j+1);
//    }

    public static int daoyushuliang1(char grid[][]) {
        int n = grid[0].length;
        if (n == 0) return 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for(int j =0; j < grid[0].length; j++) {
                if (grid[i][j] == '1')
                    count++;
                    dfs(grid, i, j);
            }
        }
        return count;
    }
    public  static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }


    public static void main(String[] args) {

    }


}
