package ct.week01;
/*
문자열 비교

JAVA 메모리

    Method Area
    Stack | Heap

    c1 -> stack 에 c1이라는 이름에 65 or A 라는 값으로 올라감
    c2 -> stack 에 c2 라는이름으로 올라가고 c1의 같은 값을 참조함 65 or A

    String 은 Heap 에 저장
    stack에 s1 이라고 저장하고 Heap 에 A 라고 저장
    stack에 s2 저장 a라는 값이 이미 Heap에 있으니 참조 A

    new 를 하게 되면 메모리에 있어도 무조건 새로 만듬
    stack에 s3를 저장하고 Heap에 A를 새로 저장 이미 있으나 new 로 인해 새로 만든것. 주소값이 다르니까 s2나 s1과는 다른값이 됨
    s4도 마찬가지로 stack에 s4를 저장하고 Heap에 이미 저장된 A가 두개나 있지만 new기 때문에 새로 만듦. 주소값이 다르니까 s2,s1과도 다르고 s3와도 다른값

 */
public class Ex11JvmStackHeap {
    public static void main(String[] args) {
        char c1 = 'A', c2 = 'A';    // A -> 아스키코드 65 인트 65와 같다
        String s1 = "A", s2 = "A";
        String s3 = new String("A");
        String s4 = new String("A");

        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);   // 문자열과 객체는 서로 다름
        System.out.println(s3 == s4);   // 서로 다른 객체

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s4));
        /*
        단순 문자열을 비교할땐 equals를 쓰는 이유
        == 을 쓰면 위에처럼 다른경우가 생기기 때문에 equals를 사용한다.
         */
    }
}
