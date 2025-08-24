package ct.week03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/*
Queue 큐
 */
public class Ex31 {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.add("A");
        que.add("B");
        que.offer("C");
        que.offer("D");
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.isEmpty());
        System.out.println(que.size());
        System.out.println(que.remove());
        System.out.println(que);
        System.out.println(que.remove("D"));
        System.out.println(que);
    }
}
