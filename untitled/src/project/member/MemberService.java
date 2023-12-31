package project.member;

import project.common.CommonVariables;

import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();

    public void signUp() {
        System.out.println(" * 회원 가입 * ");
        System.out.println("필수 입력란 * ");
        boolean run = true;
        String id = null;
        String company = null;
        while (run) {

            System.out.println(" * 아이디를 입력해주세요.");
            id = scanner.next();
            MemberDTO result = memberRepository.idCheck(id);
            if (result != null) {
                System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
            } else {
                run = false;
            }
        }
        System.out.println("사용 가능한 아이디 입니다.");
        System.out.println(" * 비밀번호를 입력해주세요");
        String password = scanner.next();
        boolean run3 = true;
        while (run3) {
            System.out.println("회사 정보를 입력하시겠습니까?");
            System.out.println("1.예 2.아니오");
            System.out.print("선택 > ");
            int select = scanner.nextInt();
            if (select == 1) {
                System.out.println("다니는 회사를 입력해주세요.");
                company = scanner.next();
                run3 = false;
            }else if(select==2){
                run3 = false;
            }
        }
        boolean run2 = true;
        while (run2) {
            scanner.nextLine();
            System.out.println("닉네임을 적어주세요.");
            String nickName = scanner.nextLine();
            MemberDTO result2 = memberRepository.nickNameCheck(nickName);
            if (result2 != null) {
                System.out.println("중복된 닉네임입니다. 다시 써주세요.");
            } else {
                System.out.println("사용하실 수 있는 닉네임입니다.");
                run2 = false;
            }
            MemberDTO memberDTO = new MemberDTO(id, password, company, nickName);

            boolean bookDTO = memberRepository.signUp(memberDTO);
            if (bookDTO) {
                System.out.println("회원 가입에 성공했습니다.");
            } else {
                System.out.println("회원 가입에 실패했습니다. 다시 시도해주세요");
            }
        }
    }

    public void logIn() {
        System.out.println(" * 로그인 * ");
        System.out.println("아이디를 입력하세요.");
        String id = scanner.next();
        System.out.println("비밀번호를 입력하세요.");
        String passWord = scanner.next();
        MemberDTO result = memberRepository.logIn(id, passWord);
        if (result != null) {
            System.out.println("로그인 성공");
            CommonVariables.loginId = id;
            CommonVariables.loginNickname = result.getNickName();
            CommonVariables.loginCompany = result.getCompany();
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void logOut() {
        CommonVariables.loginId = null;
        System.out.println("로그아웃 되었습니다.");
    }

    public void editNickName() {
        if (CommonVariables.loginId != null) {
            System.out.println("*닉네임 수정*");
            boolean run = true;
            while (run) {
                System.out.println("수정하실 닉네임을 적어주세요.");
                String nickname = scanner.nextLine();
                scanner.nextLine();
                MemberDTO result = memberRepository.nickNameCheck(nickname);
                if (result != null) {
                    System.out.println("닉네임이 중복되었습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("사용가능한 닉네임입니다..");
                    boolean result2 = memberRepository.editNickName(nickname);
                    if (result2) {
                        System.out.println("성공적으로 변경되었습니다.");
                        CommonVariables.loginNickname = nickname;
                        run = false;
                    } else {
                        System.out.println("변경에 실패했습니다.");
                    }
                }
            }
        }
    }

    public void editCompany() {
        if (CommonVariables.loginId != null) {
            System.out.println("*회사 수정*");
            System.out.println("수정하실 회사명을 적어주세요.");
            String company = scanner.nextLine();
            scanner.nextLine();
            boolean result = memberRepository.editCompany(company);
            if (result) {
                System.out.println("성공적으로 변경되었습니다.");
            } else {
                System.out.println("변경에 실패했습니다.");
            }

        }
    }


}