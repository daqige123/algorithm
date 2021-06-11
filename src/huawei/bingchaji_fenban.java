package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bingchaji_fenban {

    static int[] p = new int[200010];
    static int find(int x) {
        if (x == p[x]) return x;
        return p[x] = find(p[x]);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i =0; i < p.length; i++) {
            p[i] = i;
        }

        Map<String, Integer> map = new HashMap<>();
        int num = 1;
        for (int i = 0; i < n; i++) {
            String[] ss = br.readLine().split(" ");
            int u = 0, v = 0;
            if (map.containsKey(ss[0])) {
                u = map.get(ss[0]);
            } else {
                u = num;
                map.put(ss[0],num);
                num++;

            }
            if (map.containsKey(ss[1])) {
                v = map.get(ss[1]);
            }else {
                v = num;
                map.put(ss[1], num);
                num++;
            }
            int pu = find(u), pv = find(v);// 找到两各节点所属组的编号。
            if (pu!=pv) {   // 如果是两个组，连成一个组。
                p[pu] = pv;
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <map.size(); i++) {
            p[i] = find(p[i]);
            set.add(p[i]);
        }
        System.out.println(set.size());
    }
}
