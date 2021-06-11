package dp;

public class feibonaqie {

       public int feibonaqie() {
           int n = 3;
           int[] dp = new int[n];
           dp[0] = 0;
           dp[1] = 1;
           int sum = 0;
           while (n >= 2) {
               sum = dp[0] + dp[1];
               dp[0] = dp[1];
               dp[1] = sum;
               n--;
           }
           System.out.println(sum);
           return sum;
       }

    public static void main(String[] args) {
        feibonaqie a = new feibonaqie();
        a.feibonaqie();

    }
}
