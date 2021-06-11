package tree;
import java.util.*;


//class Solution {
//    public int numIslands(char[][] grid) {
//        int count = 0;
//        for(int i = 0; i < grid.length; i++) {
//            for(int j = 0; j < grid[0].length; j++) {
//                if(grid[i][j] == '1'){
//                    dfs(grid, i, j);
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

//    private void dfs(char[][] grid, int i, int j){
//        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
//        grid[i][j] = '0';
//        dfs(grid, i + 1, j);
//        dfs(grid, i, j + 1);
//        dfs(grid, i - 1, j);
//        dfs(grid, i, j - 1);
//    }
//}

//    class Solution {
//        public int numIslands(char[][] grid) {
//            int count = 0;
//            for(int i = 0; i < grid.length; i++) {
//                for(int j = 0; j < grid[0].length; j++) {
//                    if(grid[i][j] == '1'){
//                        bfs(grid, i, j);
//                        count++;
//                    }
//                }
//            }
//            return count;
//        }
//        private void bfs(char[][] grid, int i, int j){
//            Queue<int[]> list = new LinkedList<>();
//            list.add(new int[] { i, j });
//            while(!list.isEmpty()){
//                int[] cur = list.remove();
//                i = cur[0]; j = cur[1];
//                if(0 <= i && i < grid.length && 0 <= j && j < grid[0].length && grid[i][j] == '1') {
//                    grid[i][j] = '0';
//                    list.add(new int[] { i + 1, j });
//                    list.add(new int[] { i - 1, j });
//                    list.add(new int[] { i, j + 1 });
//                    list.add(new int[] { i, j - 1 });
//                }
//            }
//        }
//    }


public class dfs_bfs {
    public static void bfs (char[][] nums, int row, int col){
        Queue<int[]> que = new LinkedList<>();
        int m = nums.length;
        int n = nums[0].length;
        que.add(new int[]{row, col});
        while(!que.isEmpty()) {

            int[] temp = que.remove();
            int i  = temp[0],  j = temp[1];

            if (i <m && i >=0 && j>=0 && j< n && nums[i][j]== '1') {
                nums[i][j] = '2';
                que.add(new int[] {i+1, j});
                que.add(new int[] {i-1, j});
                que.add(new int[]{i, j-1});
                que.add(new int[]{i, j+1});
            }
        }
    }

    public static int haidaoNumbers (char grid[][]) {
        int row = grid.length;
        if (row == 0) return 0;
        int col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j--) {
                if (grid[i][j] == '1'){
                    count++;
                    bfs(grid, row, col);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
