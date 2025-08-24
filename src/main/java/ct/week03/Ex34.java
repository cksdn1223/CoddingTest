package ct.week03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
배열로 큐 만들기
add(1), peek(2), poll(3), clear(4), print(5), exit(0)
 */
public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayQueue que = new ArrayQueue(5);

        while (true) {
            System.out.println("==========================================");
            System.out.println("1.add 2.peek 3.poll 4.clear 5.print 0.exit");
            System.out.println("==========================================");
            System.out.print("명령어 입력 : ");
            int n = sc.nextInt();
            if(n==0) break; // System.exit(0);
            switch (n){
                case 1:
                    System.out.print("추가할 수 입력 : ");
                    int m = sc.nextInt();
                    if(m<0) System.out.println("양수만 입력");
                    else {
                        System.out.println(que.add(m) + "추가");
                    }
                    break;
                case 2:
                    System.out.println(que.peek());
                    break;
                case 3:
                    System.out.println(que.poll() + "제거");
                    break;
                case 4:
                    que.clear();
                    System.out.println("초기화 되었습니다.");
                    break;
                case 5:
                    que.print();
                    break;
                default:
                    System.out.println("다시입력하세요");
            }

        }
    }
}

class ArrayQueue{
    private int[] queue; //큐
    private int max;     //최대 용량
    private int cnt;     //데이터 수
    private int front;   //배열 맨앞 커서
    private int rear;    //배열 맨뒤 커서

    public ArrayQueue(int max) {
        this.max = max;
        this.queue = new int[max];
        Arrays.fill(queue, -1);
        this.cnt = this.front = this.rear = 0;
    }
    public int add(int n) {
        if(cnt >= max) {
            System.out.println("Queue is full");
            return -1;
        } else {
            cnt++;
            queue[rear++] = n;
            if(rear >= max) rear = 0;
        }
        return n;
    }
    public int peek() {
        if(cnt<=0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    public int poll() {
        if(cnt<=0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int num = queue[front];
        cnt--;
        if (cnt < 0) cnt = 0;
        queue[front++] = -1;
        if (front >= max) front = 0;
        return num;
    }
    public void clear() {
        Arrays.fill(queue,-1);
        this.cnt = this.front = this.rear = 0;
    }
    public void print() {
        if(cnt <= 0) System.out.println("Queue is empty");
        else System.out.println(Arrays.toString(queue));
    }
}