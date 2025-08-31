package ct.week04;

import java.util.Scanner;
import java.util.Stack;

/**
 * Stack
 */
public class BJ10828 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < n ; i++ ){
            String s = sc.nextLine();
            String cmd = s.split(" ")[0];
            if(cmd.equals("push")) stack.push(Integer.parseInt(s.split(" ")[1]));
            else if (cmd.equals("pop")) {
                if(stack.isEmpty()) {
                    sb.append(-1).append("\n");
//                    System.out.println(-1);
                }
                else {
                    sb.append(stack.pop()).append("\n");
//                    System.out.println(stack.pop());
                }
            }
            else if(cmd.equals("size")) {
                sb.append(stack.size()).append("\n");
//                System.out.println(stack.size());
            }
            else if(cmd.equals("empty")) {
                if(stack.empty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
//                System.out.println(cmd.isEmpty() ? 1 : 0);
            }
            else if(cmd.equals("top")) {
                if(stack.isEmpty()) sb.append(-1).append("\n");
                else sb.append(stack.peek()).append("\n");
//                System.out.println(cmd.isEmpty() ? -1 : stack.peek());
            }
        }
        System.out.println(sb.toString());
    }
}
