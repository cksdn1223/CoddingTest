package ct.week04;

import java.util.Stack;

/**
 * Stack
 */
public class Ex41 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);   // boolean 리턴
        stack.push(2);  // 넣은 값 return
        System.out.println(stack);
        stack.add(0,0);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
        System.out.println(stack.get(1));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
//        System.out.println(stack.getFirst());

    }
}
