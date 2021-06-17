package vivo提前批;

import java.util.Scanner;

public class 找出7或7的倍数的字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNext()) {
            String strings[] = sc.nextLine().split(" ");
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].indexOf('7') != -1 ) count++;
                else if (Long.parseLong(strings[i]) % 7 == 0) count++;
            }
        }
        System.out.println(count);
    }
}
