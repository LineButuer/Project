package project.book;

public class BookDTO {
    private Long id;
    private String bookTitle;
    private String bookWriter;
    private String bookContents;
    private String bookKeyWord;
    private String bookKeyWord2;
    private String bookKeyWord3;

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

    public String getBookKeyWord2() {
        return bookKeyWord2;
    }

    public void setBookKeyWord2(String bookKeyWord2) {
        this.bookKeyWord2 = bookKeyWord2;
    }

    public String getBookKeyWord3() {
        return bookKeyWord3;
    }

    public void setBookKeyWord3(String bookKeyWord3) {
        this.bookKeyWord3 = bookKeyWord3;
    }

    private static Long idValue = 1L;


    public BookDTO(String bookTitle, String bookWriter, String bookContents, String bookKeyWord, String bookKeyWord2, String bookKeyWord3) {
        this.id = idValue++;
        this.bookTitle = bookTitle;
        this.bookWriter = bookWriter;
        this.bookContents = bookContents;
        this.bookKeyWord = bookKeyWord;
        this.bookKeyWord2 = bookKeyWord2;
        this.bookKeyWord3 = bookKeyWord3;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookWriter='" + bookWriter + '\'' +
                ", bookContents='" + bookContents + '\'' +
                ", bookKeyWord='" + bookKeyWord + '\'' +
                ", bookKeyWord2='" + bookKeyWord2 + '\'' +
                ", bookKeyWord3='" + bookKeyWord3 + '\'' +
                '}';
    }
}
