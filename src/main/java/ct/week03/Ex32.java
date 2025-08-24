package ct.week03;

import java.util.Deque;
import java.util.LinkedList;

/*
Deque(디큐)
 */
public class Ex32 {
    public static void main(String[] args) {
        Deque<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.offer(3);
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.size());
        System.out.println(que.isEmpty());

        que.addFirst(4);
        System.out.println(que.peek());
        System.out.println(que.peekLast());
    }
}
