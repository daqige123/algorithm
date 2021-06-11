package string;
import java.util.*;
import java.lang.*;

public class zifuchuandierda {
    public static void main(String[] args) {
        String s = "12341a";
        int first = -1, second = -1;
        int temp;
        for ( int i = 0; i < s.length(); i++) {
            temp = s.charAt(i) - '0';
            if(temp >= 0 && temp <= 9 ) {
                if(temp > first) {
                    second = first;
                    first = temp;
                }
                else if (temp > second && temp < first){
                    second = temp;
                }
            }
        }
        System.out.println(second);
    }
}
