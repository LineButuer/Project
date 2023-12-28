package project.member;

import project.book.BookDTO;
import project.book.BookRepository;
import project.common.CommonVariables;

import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();

    public void signUp() {
        System.out.println("회원 가입");
        System.out.println("필수 입력란 * ");
        boolean run = true;
        while (run) {
            System.out.println(" * 아이디를 입력해주세요.");
            String id = scanner.nextLine();
            boolean result = memberRepository.idCheck(id);
            if (result) {
                System.out.println("사용할 수 있는 id입니다.");
                run = false;
            } else {
                System.out.println("중복된 id입니다. 다시 입력해주세요");
            }
            System.out.println(" * 비밀번호를 입력해주세요");
            String password = scanner.nextLine();
            System.out.println("다니는 회사를 입력해주세요.");
            String company = scanner.nextLine();
            MemberDTO memberDTO = new MemberDTO(id, password, company);
            boolean bookDTO = memberRepository.signUp(memberDTO);
            if (bookDTO) {
                System.out.println("회원 가입에 성공했습니다.");
                run = false;
            } else {
                System.out.println("회원 가입에 실패했습니다. 다시 시도해주세요");
            }
        }
    }
    public void logIn() {
        System.out.println("아이디를 입력하세요.");
        String id = scanner.next();
        System.out.println("비밀번호를 입력하세요.");
        String passWord = scanner.next();
        MemberDTO result = memberRepository.logIn(id, passWord);
        if (result != null) {
            System.out.println("로그인 성공");
            CommonVariables.loginId = id;
        } else {
            System.out.println("로그인 실패");
        }
    }

}