package project.book;


import project.common.CommonVariables;
import project.member.MemberDTO;
import project.review.ReviewService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();
    ReviewService reviewService = new ReviewService();

    public void save() {
        System.out.println("*책저장*");
        System.out.println("책제목 입력");
        String bookTitle = scanner.nextLine();
        System.out.println("저자 입력");
        String bookWriter = scanner.nextLine();
        System.out.println("책내용 입력");
        String bookContents = scanner.nextLine();
        System.out.println("키워드 입력");
        String bookKeyWord = scanner.nextLine();
        BookDTO bookDTO = new BookDTO(bookTitle, bookWriter, bookContents, bookKeyWord);
        boolean result = bookRepository.save(bookDTO);
        if (result) {
            System.out.println("저장 성공");
        } else {
            System.out.println("저장 실패");
        }
    }

    public void edit() {
        boolean run = true;
        while (run) {
            System.out.println("1.책 제목 수정 2.책 내용 수정 3.종료");
            System.out.print("선택 > ");
            int s = scanner.nextInt();
            if (s == 2) {
                System.out.println("수정할 책 id를 입력하세요.");
                Long id = scanner.nextLong();
                scanner.nextLine();
                System.out.println("수정하고 싶은 내용을 입력하세요.");
                String contents = scanner.nextLine();
                BookDTO result = bookRepository.editContents(id, contents);
                if (result != null) {
                    System.out.println("수정이 완료되었습니다.");
                } else {
                    System.out.println("해당 id를 가진 책이 없습니다.");
                }
            } else if (s==1) {
                System.out.println("수정할 책 id를 입력하세요.");
                Long id = scanner.nextLong();
                scanner.nextLine();
                System.out.println("제목을 입력하세요");
                String title = scanner.nextLine();
                boolean bookDTO = bookRepository.editTitle(id, title);
                if(bookDTO){
                    System.out.println("수정이 완료되었습니다.");
                }else {
                    System.out.println("해당 id를 가진 책이 없습니다.");
                }
            } else if (s==3) {
                System.out.println("종료합니다.");
                run = false;
            }
        }
    }
    public void search() {
        System.out.println("책을 검색하세요");
        ArrayList<String> qs = new ArrayList<>();
        boolean run = true;
        String input = null;
        while (run) {
            input = scanner.next();
            qs.add(input);
            System.out.println("종료하려면 0번을 입력하세요.");
            if (input.equals("0")) {
                run = false;
            }
        }
        List<BookDTO> bookDTO = bookRepository.search(qs);
        if (bookDTO!=null) {
            System.out.println("책을 불러왔습니다.");
            boolean run2 = true;
            while (run2) {
                System.out.println("1.리뷰 보기 2.리뷰 작성 3.종료");
                System.out.print("선택 > ");
                int select = scanner.nextInt();
                if (select == 2) {
                    if (CommonVariables.loginId != null) {
                        reviewService.save();
                    } else {
                        System.out.println("로그인이 필요한 서비스 입니다.");
                    }
                } else if (select == 1) {
                    reviewService.list();
                } else if (select == 3) {
                    run2 = false;
                    System.out.println("메인으로 돌아갑니다.");
                }
            }
        } else {
            System.out.println("불러오는데 실패 했습니다.");
        }
    }
    public void delete(){
        System.out.println("*책삭제*");
        System.out.println("삭제하실 책의 id를 입력하세요.");
        Long id  =scanner.nextLong();
        BookDTO result=bookRepository.delete(id);
        if(result!=null){
            System.out.println("삭제가 완료되었습니다.");
        }else {
            System.out.println("해당 id를 가진 책이 없습니다.");
        }
    }
}