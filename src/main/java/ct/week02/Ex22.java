package ct.week02;

import java.util.List;
import java.util.Vector;

/*
Vector
 */
public class Ex22 {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();
        //Board 도 메모리에 올려야함 new 로 객체 생성시 메모리에 올라감
        Board board = new Board();  // Board 클래스의 생성자를 호출
        board.setNumber(1);
        board.setTitle("제목1");
        board.setCn("내용1");
        board.setWriter("작성자1");
        list.add(board);
        board = new Board();
        board.setNumber(2);
        board.setTitle("제목2");
        board.setCn("내용2");
        board.setWriter("작성자2");
        list.add(board);
        list.add(new Board(3, "제목3", "내용3", "작성자3"));
        list.add(new Board(4, "제목4", "내용4", "작성자4"));
        list.add(new Board(5, "제목5", "내용5", "작성자5"));
        list.add(new Board(6, "제목6", "내용6"));

        System.out.println("==================================");
        System.out.println("번호\t제목 \t내용 \t작성자");
        for(int i = 0 ; i < list.size() ; i++){
            Board b = list.get(i);
            System.out.printf("%d\t%s\t%s\t%s\n", b.getNumber(),b.getTitle(),
                    b.getCn(), b.getWriter());
        }

    }
}
