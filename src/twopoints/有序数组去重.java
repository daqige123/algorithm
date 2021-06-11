package twopoints;

public class 有序数组去重 {
    public static void main(String[] args) {
        int a[] = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4,5, 9, 10, 11};
        int j = 1, last = 0;
        for (int i = 0; i < a.length; i++) {
            // for ( ; a[j]==a[i] && j < a.length; j++){}
            while (a[j] == a[i] && j < a.length) j++;
            a[i+1] = a[j];
            if (j == a.length -1)  {
                last = i;   // 用这last 来标记最后的的i,方便将数组后面的数来置0.
                break;
            }
        }
        for (int i = last + 1; i < a.length; i++) {
            a[i] = -100;
        }

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
