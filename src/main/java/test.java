import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] sides = {1, 2, 3};
        int max = 0;
        int plus = 0;
        for(int num : sides){
            if(max == 0) max = num;
            else if(num > max) max = num;
        }
        List<Integer> list = new ArrayList<>();
        for(int num : sides){
            list.add(num);
        }
        list.remove(list.indexOf(max));

        System.out.println(max + " " + plus);

    }
}
