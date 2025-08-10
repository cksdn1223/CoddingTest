package ct.week01;
/*
반복문 랙
 */
public class Ex06 {
    public static void main(String[] args) {
        // 구구단 세로형
        for(int i = 2; i < 10 ; i++){
            System.out.println("==== "+i+"단 ====");
            for(int j = 1; j < 10 ; j++){
//                System.out.println(i+"X"+j+"="+i*j);
                System.out.printf("%d X %d = %d\n", i,j,i*j);
            }
        }
        System.out.println("====가로형====");
        // 구구단 가로형
        for(int i = 1; i < 10 ; i++){
            for(int j = 2; j < 10 ; j++){
                System.out.printf("%dX%d=%-3d",j,i,(i*j));
            }
            System.out.println();
        }
    }
}
