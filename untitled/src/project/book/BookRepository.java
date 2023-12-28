package project.book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    List<BookDTO> bookDTOList = new ArrayList<>();

    public boolean save(BookDTO bookDTO) {
        return bookDTOList.add(bookDTO);

    }

    public boolean search(ArrayList<String> qs) {
        for (BookDTO bookDTO : bookDTOList) {
            for (String q : qs) {
                if (bookDTO.getBookTitle().contains(q) || bookDTO.getBookContents().contains(q) || bookDTO.getBookKeyWord().contains(q) || bookDTO.getBookWriter().contains(q)) {
                    for (int i = 0; i < bookDTOList.size(); i++) {
                        System.out.println(bookDTOList.get(i));


                    }
                } return true;

            }

        }return false;
    }

}