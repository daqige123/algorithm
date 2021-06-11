package guanglianda;

import java.util.Scanner;

public class GLDMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int addtime = 0;
        int res = 0;
        int a = 0;
        for (int i = 0; i < n; i++){
            a = sc.nextInt();
            a = a + k * addtime;
            if (a > w) {
                res += (a-w);
                addtime++;
            }
        }
        System.out.println(res);
    }
}
