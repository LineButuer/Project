package project;

import project.book.BookService;
import project.common.CommonVariables;

import project.community.CommunityService;
import project.member.MemberService;

import java.util.Scanner;

public class Projectmain {

    public static void main(String[] args) {
        CommunityService communityService = new CommunityService();
        BookService bookService = new BookService();
        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("1.책검색 2.회원 가입 3.로그인 4.커뮤니티 5.회원정보 수정 6.로그아웃 7.종료");
            int select = scanner.nextInt();
            if (select == 1) {
                System.out.println(" * 책검색 * ");
                bookService.search();
                // 책 검색 했을 때 리뷰 게시판 나오면 좋을 것
            } else if (select == 14) {
                //관리자 tap
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
                    System.out.println("------------------커뮤티니-------------------");
                    System.out.println("1.글쓰기 2.글목록 3.글조회 4.인기글 5.검색 6.종료");
                    //인기글 조건은 조회수 10이상 넘어가는 것으로 설정

                    int select2 = scanner.nextInt();
                    if (select2 == 1) {
                        if (CommonVariables.loginId != null) {
                            communityService.save();
                        } else {
                            System.out.println("로그인이 필요합니다.");
                        }
                    } else if (select2 == 2) {
                        communityService.comList();

                    } else if (select2 == 3) {
                        communityService.findCom();

                    } else if (select2 == 4) {
                        communityService.hottest();

                    } else if (select2 == 5) {
                        communityService.search();

                    } else if (select2 == 6) {
                        run2 = false;
                    }
                }
            } else if (select == 5) {
                System.out.println("*회원정보 수정*");
                boolean run2 = true;
                while (run2) {
                    System.out.println("1.닉네임 변경 2.회사 변경 3.종료");
                    int s = scanner.nextInt();
                    if (s == 1) {
                        memberService.editNickName();
                    } else if (s == 2) {
                        memberService.editCompany();
                    } else if (s == 3) {
                        run2 = false;
                    }
                }
            } else if (select == 6) {
                memberService.logOut();
            } else if (select == 7) {
                run = false;
            }
        }
    }
}
