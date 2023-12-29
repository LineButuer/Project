package project.book;

public class BookDTO {
    private Long id;
    private String bookTitle;
    private String bookWriter;
    private String bookContents;
    private String bookKeyWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    public String getBookContents() {
        return bookContents;
    }

    public void setBookContents(String bookContents) {
        this.bookContents = bookContents;
    }

    public String getBookKeyWord() {
        return bookKeyWord;
    }

    public void setBookKeyWord(String bookKeyWord) {
        this.bookKeyWord = bookKeyWord;
    }



    private static Long idValue = 1L;


    public BookDTO(String bookTitle, String bookWriter, String bookContents, String bookKeyWord) {
        this.id = idValue++;
        this.bookTitle = bookTitle;
        this.bookWriter = bookWriter;
        this.bookContents = bookContents;
        this.bookKeyWord = bookKeyWord;

    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "책번호=" + id +
                ", 책제목='" + bookTitle + '\'' +
                ", 작가='" + bookWriter + '\'' +
                ", 책내용='" + bookContents + '\'' +
                ", 책 키워드='" + bookKeyWord + '\'' +
                '}';
    }
}
