public class test {
    public static void main(String[] args) {
        int[] answer = new int[2];
        int numer1 = 1, denom1 = 2, numer2 = 3, denom2 = 4;
        if(denom2%denom1 ==0 || denom1%denom2 ==0){
            answer[1] = denom1>denom2 ? denom1 : denom2;
        }


        double total = (double) numer1/denom1 + (double) numer2/denom2;
        System.out.println(total*answer[1]);
        double number = total*answer[1];
        answer[0] = (int) number;
        System.out.println(answer[0]+","+answer[1]);
    }
}
