package ct.week04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열로 스택 만들기
 */
public class Ex42 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        Scanner sc = new Scanner(System.in);
        //1. push 2.peek 3.pop 4.clear 5.print 0.exit
        do {
            System.out.println(String.format("%d / %d", stack.count(), stack.size()));
            System.out.println("1.push 2.peek 3.pop 4.clear 5.print 0.exit");
            int n = sc.nextInt();
            if (n == 0) break;
            if (n == 1){
                stack.push(sc.nextInt());
            }else if(n==2){
                System.out.println(stack.peek());
            }else if(n==3){
                System.out.println(stack.pop());
            }else if(n==4){
                stack.clear();
            }else if(n==5){
                stack.print();
            }else {
                System.out.println("Error");
            }
        } while (true);
    }
}

class ArrayStack {
    private int max;    // 최대 몇개까지 들어갈건지
    private int top;    // 현재 어디까지 채워져 있는지
    private int stack[];// 채워지지 않으면 -1


    public ArrayStack() {}
    public ArrayStack(int max) {
        this.max = max;
        this.top = 0;
        stack = new int[max];
        Arrays.fill(stack, -1);
    }

    public void push(int n){
        if(top >= max) System.out.println("Stack is full!");
        else stack[top++] = n;
    }
    public int peek() {
        if(top <= 0) System.out.println("Stack is empty!");
        else return stack[top-1];
        return -1;
    }
    public int pop(){
        if(top <= 0) System.out.println("Stack is empty!");
        else {
            int n = stack[top-1];
            stack[--top] = -1;
            return n;
        }
        return -1;
    }
    public void clear(){
        this.top = 0;
        Arrays.fill(stack, -1);
    }
    public void print(){
        // -1 보다 큰 경우만 출력
        for(int num : stack){
            if (num<=-1) continue;
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int size() {
        return this.max;
    }
    public int count() {
        return this.top;
    }
}
