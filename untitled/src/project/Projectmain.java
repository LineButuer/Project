package project;

import project.book.BookService;
import project.common.CommonVariables;
import project.member.MemberRepository;
import project.member.MemberService;

import java.util.Scanner;

public class Projectmain {

    public static void main(String[] args) {
        BookService bookService = new BookService();
        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("1.책검색 2.회원 가입 3.로그인 4.커뮤니티 5.종료");
            int select = scanner.nextInt();
            if (select == 1) {
                bookService.search();
            } else if (select == 14) {
                boolean run2 = true;
                while (run2) {
                    System.out.println("1.책저장 2.책수정 3.책삭제 4.종료");
                    int select2 = scanner.nextInt();
                    if (select2 == 1) {
                        bookService.save();
                        System.out.println("계속 저장 하시겠습니까?");
                        System.out.println("1.yes 2.no");
                        int select3 = scanner.nextInt();
                        if (select3 == 2) {
                            run2 = false;
                        } else {
                            run2 = true;
                        }
                    }
                }
            } else if (select == 2) {
                memberService.signUp();

            } else if (select == 3) {
                memberService.logIn();
            } else if (select == 4) {
                boolean run2 = true;
                while (run2) {
                    System.out.println("1.글쓰기 2.글목록 3.인기글 4.검색");
                    int select2 = scanner.nextInt();
                    if(select2==1){
                        if(CommonVariables.loginId!=null){
                            // 게시글 글쓰기 기능
                        }
                    }
                }
            }
        }
    }
}
