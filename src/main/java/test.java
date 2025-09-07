import java.util.*;

public class test {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        String[] str = my_string.toLowerCase().replaceAll("[a-z]", " ").split(" ");
        System.out.println(Arrays.toString(str));
        for( String s : str){
            if(!s.equals("")){

            }
        }

    }
}
