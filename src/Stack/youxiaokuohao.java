package Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class youxiaokuohao {
    public static boolean voildKuohao (String s) {
        if (s.length() % 2 == 1) return false;
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}'); map.put('[', ']');  map.put('(', ')');
        Stack<Character> stack = new Stack<>();
        for ( int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {     // 如果遇到左边的括号，那就压入栈。
                stack.add(c);
            } else {
                if (stack.isEmpty())  return false;  // 如果不是左括号，说明是应该是右括号
                char top = stack.pop();   // 那么取出栈顶的左括号 与右括号匹配
                if (map.get(top) != c) return false;  // 不匹配的话返回true.
            }
        }
        return stack.size() == 0;  // 如果最后栈里面的没有左括号了，说明是成对的。
    }

    public static void main(String[] args) {
        System.out.println(voildKuohao("[{}]"));
    }
}
