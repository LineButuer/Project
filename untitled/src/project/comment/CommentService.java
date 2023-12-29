package project.comment;

import project.common.CommonVariables;

import java.util.Scanner;

public class CommentService {
    Scanner scanner = new Scanner(System.in);
    CommentRepository commentRepository = new CommentRepository();
    public void save(){
        if(CommonVariables.loginId!=null) {
            System.out.println("*댓글 작성*");
            System.out.println("글내용");
            String contents = scanner.nextLine();
            CommentDTO commentDTO = new CommentDTO(CommonVariables.loginNickname, contents);
            boolean result = commentRepository.save(commentDTO);
            if (result) {
                System.out.println("저장 성공!");
            } else {
                System.out.println("실패ㅠㅠ");
            }
        }else {
            System.out.println("로그인이 필요한 서비스 입니다.");
        }
    }
    public void list(){
        System.out.println("*댓글*");
        commentRepository.list();

    }
}
