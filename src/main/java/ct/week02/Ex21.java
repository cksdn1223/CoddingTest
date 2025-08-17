package ct.week02;

import java.util.ArrayList;
import java.util.List;

/*
List
 */
public class Ex21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  //다형성
        list.add("Java");
        list.add("Spring");
        list.add("MyBatis");
        System.out.println(list);
        list.add(2,"Oracle");
        System.out.println(list);
        list.set(3,"Mybatis");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add("Mybatis");
        list.add("Mybatis");
        System.out.println(list);
        list.remove("Mybatis");
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
