package dp;

public class zuichanghuiwenzichuan {

     public String zuichang(String s) {
         if (s.isEmpty()) return s;
         if (s.length() == 1) return null;
         int n = s.length();
         boolean dp [][] = new boolean[n][n];
         int left = 0, right = 0;
         for (int i = n - 2; i >= 0; i--) {
             dp[i][i] = true;
             for(int j = i + 1; j < n; j++) {
                 if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] || j - i < 2)
                     dp[i][j] = true;
                 if (dp[i][j] && j - i > right - left) {
                     right = j;
                     left = i;
                 }
             }
         }
         return s.substring(left, right + 1);
     }

    public static void main(String[] args) {
        zuichanghuiwenzichuan a = new zuichanghuiwenzichuan();

        String s =  a.zuichang("bwoiowbu");
        System.out.println(s);
    }
}
