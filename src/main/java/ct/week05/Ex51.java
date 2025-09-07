package ct.week05;

import java.util.TreeSet;

public class Ex51 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(90);
        scores.add(80);
        scores.add(70);
        scores.add(100);
        scores.add(90);
        System.out.println(scores);

        Integer score = null;
        score = scores.first();
        System.out.println("first : " + score);

        score = scores.last();
        System.out.println("last : " + score);

        score = scores.lower(88);
        System.out.println("lower : " + score);

        score = scores.higher(88);
        System.out.println("higher : " + score);

        score = scores.floor(78);
        System.out.println("floor : " + score);
    }
}
