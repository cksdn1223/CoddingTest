package ct.week05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이진 검색
 */
public class Ex54 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 1, 9, 10, 2, 7, 4};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.sort(arr);

        int idx = Arrays.binarySearch(arr, n);
        System.out.println(idx);
//        if(idx < 0)
    }
}
