package project.community;

import project.common.CommonVariables;

import java.util.ArrayList;
import java.util.Scanner;

public class CommunityService {
    Scanner scanner = new Scanner(System.in);
    CommunityRepository communityRepository = new CommunityRepository();

    public void save() {
        System.out.println("* 글쓰기 * ");
        System.out.println("글 제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("글을 입력하세요");
        String contents = scanner.nextLine();
        CommunityDTO communityDTO = new CommunityDTO(title, CommonVariables.loginNicname ,contents);
        boolean result = communityRepository.save(communityDTO);
        if (result) {
            System.out.println("저장되었습니다.");
            System.out.println("글정보 = " + result);
        } else {
            System.out.println("저장되지 않았습니다.");
        }
    }
    public void comList() {
        System.out.println(" * 글목록 * ");
        boolean communityDTO = communityRepository.comList();
    }

    public void findCom() {
        System.out.println("*글조회*");
        System.out.println("조회할 글 번호를 입력하세요.");
        Long id = scanner.nextLong();
        boolean result = communityRepository.updateHits(id);
        CommunityDTO communityDTO = communityRepository.findCom(id);
        if (result) {
            if (communityDTO != null) {
                System.out.println(communityDTO + "글을 성공적으로 불러왔습니다.");
            } else {
                System.out.println("글을 블러오는데 실패했습니다.");
            }
        }
    }
    public void hottest() {
        System.out.println("*인기 게시물*");
        CommunityDTO communityDTO = communityRepository.hottest();
        if (communityDTO != null) {
            System.out.println(communityDTO + "인기 게시물!!");
        }

    }
    public void search(){
        System.out.println("*검색*");
        System.out.println("검색어를 입력하세요");
        ArrayList<String>qs = new ArrayList<>();
        boolean run =true;
        String input = null;
        while (run){
            input = scanner.nextLine();
            qs.add(input);
            if(input.equals(" ")){
                run = false;
            }
        }
        boolean result = communityRepository.search(qs);
        if(result){
            System.out.println("게시글을 불러왔습니다.");
        }else {
            System.out.println("불러오는데 실패했습니다.");
        }
    }

}
