package project.book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    List<BookDTO>bookDTOList = new ArrayList<>();
    public boolean save(BookDTO bookDTO) {
       return bookDTOList.add(bookDTO);

    }

    public BookDTO search(String q){
        for(BookDTO bookDTO : bookDTOList){
            if(bookDTO.getBookContents().contains(q)){
                return bookDTO;

            }
        }return null;
    }
}

