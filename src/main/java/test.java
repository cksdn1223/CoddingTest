import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 2) {
                firstIndex = i;
                break;
            }
        }
        for(int i = arr.length-1 ; i > 0 ; i--){
            if(arr[i] == 2) {
                lastIndex = i;
                break;
            }
        }
        int[] answer2 = {2};
        int[] answer3 = {-1};
        if(firstIndex == lastIndex) System.out.println(Arrays.toString(answer2));
        else if(firstIndex == -1 && lastIndex == -1) System.out.println(Arrays.toString(answer3));
        int[] answer = new int[lastIndex-firstIndex+1];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = arr[firstIndex++];
        }

        System.out.println(Arrays.toString(answer));

    }
}
