package ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class BJ28278 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            String s = sc.nextLine();
            String cmd = s.split(" ")[0];
            if(cmd.equals("1")) stack.push(Integer.parseInt(s.split(" ")[1]));
            else if(cmd.equals("2")) sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            else if(cmd.equals("3")) sb.append(stack.size()).append("\n");
            else if(cmd.equals("4")) sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            else if(cmd.equals("5")) sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
        }
        System.out.println(sb);
    }
}
