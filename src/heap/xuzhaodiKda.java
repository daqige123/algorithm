package heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class xuzhaodiKda {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 2, 2 };
        int k = 3;
        Queue<Integer> que = new PriorityQueue<>();  // 默认是小根堆
        for (int num: a ) {
            que.add(num);
            if(que.size() > k) {
                que.remove();
            }
        }
        System.out.println(que.peek());
    }
}
