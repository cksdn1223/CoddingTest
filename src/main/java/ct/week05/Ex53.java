package ct.week05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이진검색
 */
public class Ex53 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 1, 9, 10, 2, 7, 4};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = BinSearch.search(arr, n);
        if(idx == -1) System.out.println("숫자 찾을수 없음");
        else System.out.println("숫자 존재");
    }
}
class BinSearch {
    static int search(int[] arr, int key){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        do {
            int center = (start+end)/2;
            if ( key == arr[center]) return arr[center];

            if (arr[center] < key) start = center+1;
            else end = center-1;

        } while ( start <= end);
        return -1;
    }
}
