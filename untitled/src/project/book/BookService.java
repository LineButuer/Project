package project.book;


import project.common.CommonVariables;
import project.review.ReviewService;

import java.util.ArrayList;
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

    public void search() {
        System.out.println("책을 검색하세요");
        ArrayList<String> qs = new ArrayList<>();
        boolean run = true;
        String input = null;
        while (run) {
            input = scanner.nextLine();
            qs.add(input);
            System.out.println("종료하려면 0번을 입력하세요.");
            if (input.equals("0")) {
                run = false;
            }
        }
        boolean bookDTO = bookRepository.search(qs);
        if (bookDTO) {
            System.out.println("책을 불러왔습니다.");
            boolean run2 =true;
            while (run2) {
                System.out.println("1.리뷰 보기 2.리뷰 작성 3.종료");
                System.out.print("선택 > ");
                int select = scanner.nextInt();
                if (select == 2) {
                    if(CommonVariables.loginId!=null) {
                        reviewService.save();
                    }else {
                        System.out.println("로그인이 필요한 서비스 입니다.");
                    }
                } else if (select == 1) {
                    reviewService.list();
                } else if (select==3) {
                    run2 =false;
                    System.out.println("메인으로 돌아갑니다.");
                }
            }
        } else {
            System.out.println("불러오는데 실패 했습니다.");
        }
    }
}