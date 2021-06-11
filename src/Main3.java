import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int t = Integer.parseInt(str[2]);
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        boolean visited[][] = new boolean[n][m];
        int cur = 0;
        dfs(matrix, 0 ,0, n, m, visited, res, cur);
        int max = Integer.MIN_VALUE;
        for (int num: res){
            if (num <= t && num > max) {
                max = num;
            }
        }
        if (max== Integer.MIN_VALUE) {
            System.out.println(-1);
        }else {
            System.out.println(max);
        }
    }

    public  static void dfs(int[][] matrix, int i, int j, int n, int m, boolean[][] visited, ArrayList<Integer> res, int cur) {
        if (i < 0 || i>=n ||j < 0 || j>= m || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        if (i == n - 1 && j == m-1) {
            res.add(cur + matrix[i][j]);
        }
        cur += matrix[i][j];
        dfs(matrix, i+1, j, n, m,visited, res, cur);
        dfs(matrix, i, j+1, n, m,visited, res, cur);
        cur -= matrix[i][j];
        visited[i][j] = false;
    }
}
