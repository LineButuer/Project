package project.community;

import project.common.CommonVariables;

import java.util.Scanner;

public class CommunityService {
    Scanner scanner = new Scanner(System.in);
    CommunityRepository communityRepository = new CommunityRepository();
    public void save(){
        System.out.println( "* 글쓰기 * ");
        System.out.println("글을 입력하세요");
        String contents = scanner.nextLine();
        CommunityDTO communityDTO = new CommunityDTO(CommonVariables.loginNicname,contents);
        boolean result = communityRepository.save(communityDTO);
        if(result){
            System.out.println("저장되었습니다.");
            System.out.println("글정보 = " + result);
        }else {
            System.out.println("저장되지 않았습니다.");
        }
    }
    public void comList(){
        System.out.println(" * 글목록 * ");
        boolean communityDTO = communityRepository.comList();
    }
    public void hottest(){
        System.out.println("*인기 게시물*");
    CommunityDTO communityDTO = communityRepository.hottest();
    if(communityDTO!=null){
        System.out.println(communityDTO);
    }

    }

}
