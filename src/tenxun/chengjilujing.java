package tenxun;

import java.util.*;
public class chengjilujing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str1[] = sc.nextLine().split(" ");
            int n, m;
            n = Integer.parseInt(str1[0]);
            m = Integer.parseInt(str1[1]);
            int[][] dp = new int[n][m];
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                String hang[] = sc.nextLine().split(" ");
                for (int j = 0; j <m; j++) {
                    a[i][j] = Integer.parseInt(hang[j]);
                }
            }
            int res;
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++ ) {

                }
            }
            System.out.println(-1);
        }

    }
}
