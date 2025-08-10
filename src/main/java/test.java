import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String my_string = "nice to meet you";
        String answer = "";
        answer = my_string.replaceAll("[aeiou]","");
        System.out.println(answer);
    }
}
