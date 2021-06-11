package LinkedList;

import java.util.Scanner;
class myLinkedList {
    int val = 0;
    myLinkedList next = null;
    myLinkedList (int val){
        this.val = val;
    }
    myLinkedList() {
        this.val = 0;
    }
}



public class hebingyouxulianbiao {

    public static myLinkedList mergeList (myLinkedList s1, myLinkedList s2) {
        myLinkedList head = new myLinkedList();
        myLinkedList cur = head;
        while (s1!= null && s2 != null) {
            if (s1.val < s2.val) {
                cur.next = s1;
                cur = cur.next;
                s1 = s1.next;
            }
            else if (s1.val > s2.val) {
                cur.next = s2;
                cur = cur.next;
                s2 = s2.next;
            }
            else {
                cur.next = s1;
                s1 = s1.next;
                cur = cur.next;
                int temp = cur.val;
                while (s1!= null && temp == s1.val) {
                    s1 = s1.next;
                }
                while (s2!=null && temp == s2.val) {
                    s2 = s2.next;
                }
            }
        }
        if (s1 == null) cur.next = s2;
        if (s2 == null) cur.next = s1;
        return head.next;
    }


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4,4,4, 5, 5};
        int b[] = {1, 2, 4,4, 4, 5,5,6, 6, 6, 6, 6, 6};
        myLinkedList head1 = new myLinkedList(0);
        myLinkedList head2 = new myLinkedList(0);
        myLinkedList s1 = head1, s2 =  head2;
        for (int i = 0; i < a.length; i++) {
            myLinkedList node = new myLinkedList(a[i]);
            s1.next = node;
            s1 = s1.next;
        }
        for (int i = 0; i < b.length; i++) {
            myLinkedList node = new myLinkedList(b[i]);
            s2.next = node;
            s2 = s2.next;
        }
        s1 = head1; s2 =  head2;

        while(s1!= null) {
            System.out.print(s1.val + " ");
            s1 = s1.next;
        }
        System.out.println();
        System.out.print("s2: " + " ");
        while (s2 != null) {
            System.out.print(s2.val + " ");
            s2 = s2.next;
        }
        s1 = head1.next;
        s2 = head2.next;
        myLinkedList test = mergeList(s1, s2);
        System.out.println();

        while (test != null) {
            System.out.print(test.val + " ");
            test = test.next;
        }

    }
}