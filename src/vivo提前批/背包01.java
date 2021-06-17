package vivo提前批;

import java.util.Scanner;

public class 背包01 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        // 物品的数量为N
        //int N = reader.nextInt();
        // 背包的容量为V
        int V = reader.nextInt();
        reader.nextLine();
        // 一个长度为N的数组，第i个元素表示第i个物品的体积；
        String string[] = reader.nextLine().split(",");
        String string2[] = reader.nextLine().split(",");
        int N = string.length;
        int[] v = new int[N + 1] ;

        // 一个长度为N的数组，第i个元素表示第i个物品的价值；
        int[] w = new int[N + 1] ;

        for (int i = 0 ; i < N ; i++){
            // 接下来有 N 行，每行有两个整数:v[i],w[i]，用空格隔开，分别表示第i件物品的体积和价值
            v[i] = Integer.parseInt(string[i]);
            w[i] = Integer.parseInt(string2[i]);
        }
        reader.close() ;


        int[][] dp = new int[N+1][V+1];
        dp[0][0] = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 0; j <= V; j++){
                if(j >= v[i]){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-v[i]] + w[i]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(dp[N][V]);
    }
}
