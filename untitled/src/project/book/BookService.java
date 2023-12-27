package project.book;

import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();

    public void save(){
        System.out.println("책제목 입력");
        String bookTitle = scanner.next();
        System.out.println("저자 입력");
        String bookWrite = scanner.next();
        System.out.println("책내용 입력");
        String bookContents = scanner.next();
        System.out.println("첫 번째 키워드 입력");
        String bookKeyWord = scanner.next();
        System.out.println("두 번째 키워드 입력");
        String bookKeyWord2 = scanner.next();
        System.out.println("세 번째 키워드 입력");
        String bookKeyWord3 = scanner.next();
        BookDTO bookDTO = new BookDTO(bookTitle, bookContents, bookContents,bookKeyWord,bookKeyWord2,bookKeyWord3);
        boolean result = bookRepository.save(bookDTO);
        if(result){
            System.out.println("저장 성공");
        }else {
            System.out.println("저장 실패");
        }
    }
    public void search(){
        System.out.println("책을 검색하세요");
    String q = scanner.next();
    BookDTO bookDTO =bookRepository.search(q);
    if (bookDTO!=null){
        System.out.println("bookDTO = " + bookDTO);
    }
    }
}
