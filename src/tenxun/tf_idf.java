package tenxun;

import java.util.*;

public class tf_idf {
    public static void donglao_tfidf() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 代表n篇文章
        int a[]  = new int[n];    // n个k , k代表当前文章的单词数。
        List<Map<String, Integer>> mapList = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < a[i]; j++) {
                String s = sc.next();
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                }else {
                    map.put(s,1);
                }
            }
            mapList.add(map);
        }
        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = mapList.get(i);
            double tf = 0, idf = 0, z = 0;
            for (String s: map.keySet()) {
                idf = 0;
                tf = map.get(s);
                for (int j = 0; j < n; j++) {
                    if (mapList.get(j).containsKey(s))
                        idf += 1;
                }
                z = Math.max(z, tf / idf);
            }
            System.out.printf("%.6f\n", z);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n篇文章
        int[] k  = new int[n];  // 每篇文章的词数
        List<Map<String, Integer>> maplist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < k[i]; j ++) {
                String s = sc.next();
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
            maplist.add(map);
        }

        // 计算 tf , idf ,res;
        for (int i = 0; i < n; i++) { // 遍历每一篇文章
            Map<String, Integer> temp = maplist.get(i);
            double tf = 0.0, idf = 0.0, res = 0.0;
            for (String s: temp.keySet()) {
                tf = temp.get(s);
                for (int j = 0; j < n; j++) {
                    if (maplist.get(j).containsKey(s)) {
                        idf++;
                    }
                }
                res = Math.max(res, tf/idf);
            }
            System.out.printf("%.6f\n", res);
        }
    }
}
