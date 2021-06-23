import java.util.*;
class Snake{
    int[] x;
    int[] y;
    int node = 0;
    int derection = 0;  // a:1左 , d:2右, w:3上, s:4下
    Snake(int N){
        this.x = new int[N];
        this.y = new int[N];
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1[] = sc.nextLine().split(" ");
        int row = Integer.parseInt(line1[0]);
        int col = Integer.parseInt(line1[1]);
        char[][] map = new char[row][col];
        int N = 0;
        for (int i = 0; i < row; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < col; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == '>' || map[i][j]=='x')  N++;
            }
        }
        // 通过回溯找到蛇的身体的坐标
        Snake s = new Snake(N);
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if (map[i][j] == '>') {   // 找到蛇头，开始dfs  找到其他的身体，使用dfs就保证了存入Snake的左边是有序的。
                    dfs(map, i, j, s, s.node);     // dfs 这里是先添加的蛇头。也就是舌头坐标是 s.x[0], s.y[0]
                }
            }
        }
        // 判断蛇的当前方向  // a:1左 , d:2右, w:3上, s:4下
        if (s.y[0] == s.y[N-1] ) {
            if (s.x[0] > s.x[N-1])  s.derection = 4;
            else s.derection = 3;
        }
        if (s.x[0] == s.x[N-1] ) {
            if (s.y[0] > s.y[N-1])  s.derection = 2;
            else s.derection = 1;
        }
        System.out.println(s.derection);
        // 打印蛇的身体坐标
        for (int i = N-1; i >= 0; i--) {
            System.out.println("x=" + s.x[i]+"," + "y=" + s.y[i] + ";");
        }
        while(true) {
            String key = sc.next();
            move(s, key, map);
            // 打印蛇的身体坐标
            for (int i = N-1; i >= 0; i--) {
                System.out.println("x=" + s.x[i]+"," + "y=" + s.y[i] + ";");
            }
        }
    }

    public static void move(Snake s, String key, char[][] map) {
        if (key.equals("w")) {   // 上
            if (map[s.x[0] + 1][s.y[0]] == '1' || s.derection == 4) return;
            int x0 = s.x[0], y0 = s.y[0];

            for (int i  = s.x.length -1; i > 0; i--) {
                s.x[i] = s.x[i - 1];
                s.y[i] = s.y[i - 1];
            }
            s.x[0] = x0 + 1; s.y[0] = y0;
            s.derection = 3;

        }
        if (key.equals("s")) {   // 下
            if (map[s.x[0] - 1][s.y[0]] == '1' || s.derection == 3) return;
            int x0 = s.x[0], y0 = s.y[0];
            for (int i  = s.x.length -1; i > 0; i--) {
                s.x[i] = s.x[i - 1];
                s.y[i] = s.y[i - 1];
            }
            s.x[0] = x0 - 1 ; s.y[0] = y0;
            s.derection = 4;
        }
        if (key.equals("a")) {   // 左
            int x0 = s.x[0], y0 = s.y[0];
            if (map[x0 ][y0 - 1] == '1' || s.derection == 2) return;
            for (int i  = s.x.length -1; i > 0; i--) {
                s.x[i] = s.x[i - 1];
                s.y[i] = s.y[i - 1];
            }
            s.x[0] = x0 ; s.y[0] = y0 -1;
            s.derection = 1;
        }
        if (key.equals("d")) {   // you
            int x0 = s.x[0], y0 = s.y[0];
            if (map[x0 ][y0 + 1] == '1' || s.derection == 1) return;
            for (int i  = s.x.length -1; i > 0; i--) {
                s.x[i] = s.x[i - 1];
                s.y[i] = s.y[i - 1];
            }
            s.x[0] = x0 ; s.y[0] = y0 + 1;
            s.derection = 2;
        }

    }

    public  static void dfs(char[][] grid, int i, int j, Snake s, int node) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || grid[i][j]=='1') {
            return;
        }
        grid[i][j] = '0';
        s.x[s.node] = i;
        s.y[s.node] = j;
        s.node++;
        dfs(grid, i + 1, j, s, s.node);
        dfs(grid, i - 1, j, s, s.node);
        dfs(grid, i, j + 1, s, s.node);
        dfs(grid, i, j - 1, s, s.node);
    }
}

