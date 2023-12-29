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
                }
                return true;

            }

        }
        return false;
    }

    public BookDTO editContents(Long id, String contents) {
        for (BookDTO bookDTO : bookDTOList) {
            if (id.equals(bookDTO.getId())) {
                bookDTO.setBookContents(contents);
                return bookDTO;
            }
        }
        return null;
    }

    public boolean editTitle(Long id, String title) {
        for (BookDTO bookDTO : bookDTOList) {
            if (id.equals(bookDTO.getId())) {
                bookDTO.setBookTitle(title);
                return true;
            }
        }
        return false;
    }
    public BookDTO delete(Long id){
        for (BookDTO bookDTO : bookDTOList){
            if(id.equals(bookDTO.getId())){
                bookDTOList.remove(bookDTO);
                return bookDTO;
            }
        }return null;
    }


}