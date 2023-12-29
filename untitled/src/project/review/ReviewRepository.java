package project.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReviewRepository {
    Scanner scanner = new Scanner(System.in);
    List<ReviewDTO>reviewDTOList = new ArrayList<>();
    public boolean save(ReviewDTO reviewDTO){
        return reviewDTOList.add(reviewDTO);
    }
    public boolean list(){
        for(int i =0; i< reviewDTOList.size(); i++){
            System.out.println(reviewDTOList.get(i));
        }
        return true;
    }
}
