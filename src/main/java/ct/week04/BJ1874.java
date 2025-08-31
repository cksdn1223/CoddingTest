package ct.week04;

import java.util.Scanner;
import java.util.Stack;

/**
 * 스택수열
 */
public class BJ1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int top = 0;
        int k = sc.nextInt();
        for( int i = 0 ; i < k ; i++ ){
            int n = sc.nextInt();
            if(top < n){
                for(int j = top+1 ; j <= n ; j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                top = n;
            } else if (n != stack.peek()) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb.toString());
    }
}
