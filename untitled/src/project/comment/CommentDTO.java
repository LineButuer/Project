package project.comment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CommentDTO {
    private String commentWriter;
    private String contents;
    private String commnetAt;

    public String getCommentWriter() {
        return commentWriter;
    }

    public void setCommentWriter(String commentWriter) {
        this.commentWriter = commentWriter;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getCommnetAt() {
        return commnetAt;
    }

    public void setCommnetAt(String commnetAt) {
        this.commnetAt = commnetAt;
    }

    public CommentDTO(String commentWriter, String contents) {
        this.commentWriter = commentWriter;
        this.contents = contents;
        this.commnetAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "댓글{" +
                "작성자='" + commentWriter + '\'' +
                ", 댓글 내용='" + contents + '\'' +
                ", 작성 시간='" + commnetAt + '\'' +
                '}';
    }
}
