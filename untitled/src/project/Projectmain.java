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
        CommonVariables loginId = new CommonVariables();
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
                int select2 = scanner.nextInt();
                while (run2) {
                    if (select2 == 3) {
                        if (loginId != null) {
                            System.out.println("1.글작성 2.글수정 3.글삭제");
                        } else {
                            System.out.println("로그인이 필요합니다.");
                        }
                    }
                }
            }
        }
    }
}