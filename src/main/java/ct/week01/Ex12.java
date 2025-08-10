package ct.week01;

import java.util.Arrays;

/*
1차원 배열

String System Math
는 import 안 적어도 됨 자동
 */
public class Ex12 {
    public static void main(String[] args) {
        //선언
        short[] sh;
        int i[];

        //초기화
        sh = new short[3];
        sh[0] = 1;
        char[] ch = {'A', 'B', 'C'};
        ch[0] = 'a';
        ch[1] = 'E';
//        ch[3] = 'Z';
        System.out.println(ch.length);

        System.out.println(Arrays.toString(ch));
        System.out.println(ch.toString());

    }
}
