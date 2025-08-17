package ct.week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/*
배열의 복사, 정렬

copyOf 를 하게 되면 10칸의 배열을 생성해도 복사한 만큼의 칸을 새로 초기화한다
5개를 복사하면 크기도 5가 된다

 */
public class Ex14 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = new int[5];
        for(int i = 0 ; i < arr1.length ; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

        int arr3[] = new int[10];
        arr3 = Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr3));

        int arr4[] = new int[] {10,5,9,4,2,8,1};
        Arrays.sort(arr4,2,5);
        System.out.println(Arrays.toString(arr4));
    }
}
