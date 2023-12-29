package project.review;

import project.common.CommonVariables;
import project.member.MemberDTO;

import java.util.Scanner;

public class ReviewService {
    Scanner scanner = new Scanner(System.in);
    ReviewRepository reviewRepository = new ReviewRepository();

    public void save() {
        System.out.println("글작성");
        if (CommonVariables.loginCompany != null) {
            String contents = scanner.nextLine();
            ReviewDTO reviewDTO = new ReviewDTO(CommonVariables.loginNickname, contents);
            boolean result = reviewRepository.save(reviewDTO);
            if (result) {
                System.out.println("글작성에 성공했습니다.");
            } else {
                System.out.println("글작성에 실패했습니다..");
            }
        }else {
            System.out.println("리뷰를 작성하려면 회사 정보가 필요합니다.");
        }
    }

    public void list() {
        boolean result = reviewRepository.list();
        if (result) {
            System.out.println("result = " + result);
        }
    }
}
