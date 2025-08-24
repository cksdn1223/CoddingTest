package ct.week03;

import java.util.LinkedList;
import java.util.Scanner;

/*
순환 큐
 */
public class BJ1021 {
    public static void main(String[] args) {
        LinkedList<Integer> que = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 큐의 크기
        int m = sc.nextInt();   // 뽑을 수
        for(int i = 1 ; i <= n ; i++ ){
            que.add(i);
        }
        int k = 0;  // 카운트
        int[] array = new int[m];
        for(int i = 0 ; i < m ; i++){
            array[i] = sc.nextInt();
        }
        for(int arr : array) {
            int idx = que.indexOf(arr);
            if(idx <= que.size() / 2) {
                while (arr != que.getFirst()) {
                    que.add(que.poll());
                    k++;
                }
            } else{
                while (arr != que.getFirst()) {
                    que.addFirst(que.pollLast());
                    k++;
                }
            }
            que.poll();
        }
        System.out.println(k);
    }
}
