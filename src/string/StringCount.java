package string;

import javax.naming.PartialResultException;
import java.util.*;
public class StringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int count = 1;
             // ArrayList<Integer> res = new ArrayList<>();

            int max = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i-1)) {
                    count++;
                    max = Math.max(max, count);
                 } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            System.out.println(max);
        }
    }
}
