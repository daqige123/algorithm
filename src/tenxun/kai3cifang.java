package tenxun;

import java.util.*;
public class kai3cifang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  T1  = sc.nextLine();
        int T = Integer.parseInt(T1);
        while (T-- > 0 && sc.hasNextLine()) {
            String str1[] = sc.nextLine().split(" ");
            int l, r, k, n;
            l = Integer.parseInt(str1[0]);
            r = Integer.parseInt(str1[1]);
            k = Integer.parseInt(str1[2]);
//            n = 4;
//            double f = 0.0;
//            for (int i = l; i <= r; i++) {
//                f += 1 / Math.pow(i, (2.0/3.0));
//            }
//            f = f/3.0 ;
//            float a = 1;
//            while( f < a) {
//                f *= 10;
//                k++;
//            }
//            System.out.println(String.format("%.5fE-0%d ", f, k));
             double f = 0.0;
             double tempk = 1;
             for (int i = 0; i < k; i++) {
                    tempk *= 10;
             }
             tempk = 1/tempk;
             System.out.println(String.format("This is tempk %.16f",tempk));

             for ( int i = l; i <= r; i++) {
              //f += StrictMath.pow((i + tempk), (double)1/3) - StrictMath.pow(i, (double)1/3);
               f += (Math.cbrt(i + tempk) - Math.cbrt(i));
            }
            System.out.println(String.format("%.15f", f));

        }

    }
}
