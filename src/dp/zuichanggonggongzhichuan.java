package dp;

public class zuichanggonggongzhichuan {

    public int zuichanggonggongzhixulie(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public  static  String zuichanggonggongzhixulie2 (String s1, String s2) {
        // write code here
        if(s1==null || s1.length()==0 || s2==null || s2.length()==0)return "-1";
        int s1L = s1.length()-1;
        int s2L = s2.length()-1;
        StringBuilder str = new StringBuilder();
        while(s1L >= 0 && s2L >= 0){
            if(s1.charAt(s1L)==s2.charAt(s2L)){
                str.append(s1.charAt(s1L));
                s1L--;
                s2L--;
            }else{
                if (s1L>= 1 && s2L>= 1) {
                    if (Math.max(s1.charAt(s1L - 1), s2.charAt(s2L))
                            >= Math.max(s1.charAt(s1L), s2.charAt(s2L - 1)))
                        s2L--;
                    else
                        s1L--;
                }else if (s1L==0){
                    s2L--;
                }else
                    s1L--;
            }
        }
        if(str.length()==0)return "-1";
        return str.reverse().toString();

    }




    public static String zuichanggonggongzhichuan(String str1, String str2) {
        // write code here
        StringBuilder sb = new StringBuilder();
        int start = 0, end = 1;
        while (end < str1.length() + 1 ) {
            if (str2.contains(str1.substring(start, end))) {
                if (sb.length() < end - start) {
                    sb.delete(0, sb.length());
                    sb.append(str1, start, end);
                }
            } else {
                //??????????????????????????????????????????start>end??????????????????crash???
                //??????debug????????????start==end??????substring????????????""?????????contains?????????true
                //?????????start == end??????????????????end++??????
                start++;
            }
            end++;
        }
        if (sb.length() == 0) {
            return "-1";
        }
        return sb.toString();
    }
}
