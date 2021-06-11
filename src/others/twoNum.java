package others;

import java.util.*;
public class twoNum {
    public static void main(String[] args) {
        int a[] = {2, 3, 9, 4, 5};
        int target = 7;
        Map<Integer, Integer> map =  new HashMap<>();
        int[] res = new int[2];
        for (int i = 0 ; i <a.length; i++) {
            if (map.containsKey(target - a[i])) {
                 // map.put(i, map.get(target-a[i]));
                res[0] = i;
                res[1] = map.get(target - a[i]);
            } else {
                map.put(a[i], i);
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
     }
}
