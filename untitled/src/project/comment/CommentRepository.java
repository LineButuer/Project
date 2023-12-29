package project.comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    List<CommentDTO> commentDTOList = new ArrayList<>();

    public boolean save(CommentDTO commentDTO) {
        return commentDTOList.add(commentDTO);
    }

    public void list() {
        for(int i=0; i<commentDTOList.size(); i++){
            System.out.println(commentDTOList.get(i));
        }
    }
}