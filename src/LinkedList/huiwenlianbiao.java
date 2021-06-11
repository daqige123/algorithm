package LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.LinkedList;

class LinkList {
    int val = 0;
    LinkList next = null;
    LinkList(int val) {
        this.val = val;
        this.next = null;
    }
    LinkList(){
        this.val = 0;
        this.next= null;
    }
}

public class huiwenlianbiao {
    public static void main(String[] args) {
        int a[] = {1, 2,5,6, 2, 1};
        LinkList root = new LinkList();
        LinkList head = root;
        for ( int i = 0; i < a.length; i++) {
            LinkList node = new LinkList(a[i]);
            head.next = node;
            head = head.next;
        }

        System.out.println(huiwen(root.next));


    }

    public static boolean huiwen (LinkList root) {
        LinkList head = root;
        Stack<LinkList> stack = new Stack<>();
        while(head != null) {
            stack.push(head);
            head = head.next;
        }
        while(!stack.isEmpty()) {
            LinkList node = stack.pop();
            System.out.println(node.val + " " + root.val);
            if (root.val != node.val) return false;
            root = root.next;
        }
        return true;
    }
}
