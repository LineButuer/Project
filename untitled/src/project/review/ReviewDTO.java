package project.review;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReviewDTO {
    private String reviewWriter;
    private String reviewContents;
    private String createdAt;

    public String getReviewWriter() {
        return reviewWriter;
    }

    public void setReviewWriter(String reviewWriter) {
        this.reviewWriter = reviewWriter;
    }

    public String getReviewContents() {
        return reviewContents;
    }

    public void setReviewContents(String reviewContents) {
        this.reviewContents = reviewContents;
    }

    public void ReviewDTO(){

    }
    public ReviewDTO(String reviewWriter, String reviewContents) {
        this.reviewWriter = reviewWriter;
        this.reviewContents = reviewContents;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "ReviewDTO{" +
                "닉네임='" + reviewWriter + '\'' +
                ", 글내용='" + reviewContents + '\'' +
                ", 작성시간='" + createdAt + '\'' +
                '}';
    }
}
