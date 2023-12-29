package project.review;

import project.common.CommonVariables;

import java.util.Scanner;

public class ReviewService {
    Scanner scanner = new Scanner(System.in);
    ReviewRepository reviewRepository = new ReviewRepository();

    public void save(){
        System.out.println("글작성");
        String contents = scanner.nextLine();
        ReviewDTO reviewDTO = new ReviewDTO(CommonVariables.loginNicname, contents);
        boolean result = reviewRepository.save(reviewDTO);
        if(result){
            System.out.println("글작성에 성공했습니다.");
        }else {
            System.out.println("글작성에 실패했습니다..");
        }
    }

    public void list(){
        boolean result = reviewRepository.list();
        if(result){
            System.out.println("result = " + result);
        }
    }
}
