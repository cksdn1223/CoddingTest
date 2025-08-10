package ct.week01;
/*
문자열
 */
public class Ex10 {
    public static void main(String[] args) {
        String s = "AGood Morning!";
        System.out.println("charAt : " + s.charAt(7));
        System.out.println("startsWith : " + s.startsWith("good"));
        System.out.println("endsWith : " + s.endsWith("ng!"));
        System.out.println("equals : " + s.equals("good Morning!"));
        System.out.println("indexOf : " + s.indexOf("n"));
        System.out.println("lastIndexOf : " + s.lastIndexOf("n"));
        System.out.println("length : " + s.length());

        System.out.println("replace : " + s.replace("Good","good"));
        System.out.println("replace : " + s.replace("o","a"));
        System.out.println("replaceFirst : " + s.replaceFirst("o","a"));

        System.out.println("replaceAll : " + s.replaceAll("Good","good"));
        System.out.println("replaceAll : " + s.replaceAll("[Good]","a"));

        System.out.println("replaceAll : " + s.replaceAll("[^G]","a")); //not
        System.out.println("replaceAll : " + s.replaceAll("^[A]","a")); //startsWith
        System.out.println("replaceAll : " + s.replaceAll("[G]$","a")); //endsWith

        String str = "1234567890ABCDEFGabcdefg";
        System.out.println(str.replaceAll("[0-9]",""));

    }
}
