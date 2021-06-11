package guanglianda;

import java.util.*;

public class GLDMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            char[][]  grid = new char[n][n];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                grid[i] = s.toCharArray();
            }
            int l = 0, r = n-1, t = 0,b = n-1;
            StringBuilder sb = new StringBuilder();
            while (l <= r && t <= b) {
                for (int i = l; i <= r; i++) {
                    sb.append(grid[t][i]);
                }
                for (int i = t+1; i <=b;i++) {
                    sb.append(grid[i][r]);
                }
                for (int i = r -1; i>=l; i--) {
                    sb.append(grid[b][i]);
                }
                for (int i = b-1; i >= t+1; i--) {
                    sb.append(grid[i][l]);
                }
                 l++; r--; t++; b--;
            }
            int index = 0;
            for (; index < sb.length(); index++) {
                if (sb.charAt(index) == '0') break;
            }
            System.out.println(sb.substring(0, index));
        }
    }
}
