package ct.week02;
/*
게시판
 */
public class Board {
    //번호, 제목, 내용, 작성자
    private int number = 0;
    private String title = "";
    private String cn = "";
    private String writer = "";
    //생성자 public , void 없음 클래스명과 같은 메서드명 매개변수는 없거나 변수들

    public Board() {}
    public Board(int number, String title, String cn, String writer) {
        this.number = number;
        this.title = title;
        this.cn = cn;
        this.writer = writer;
    }
    public Board(int number, String title, String cn) {
        this.number = number;
        this.title = title;
        this.cn = cn;
        this.writer = "unknown";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
