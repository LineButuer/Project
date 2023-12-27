package project;

import project.book.BookService;

import java.util.Scanner;

public class Projectmain {

    public static void main(String[] args) {
        BookService bookService = new BookService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.책검색 2.로그인 3.커뮤니티 4.종료");
        int select = scanner.nextInt();
        if(select ==1 ){
            bookService.search();
        }
        // 검색 키워드에 맞는 책들이 나와야 함. 그러니까 목록을 뽑아내면 될듯?
        // 두 번째 검색은 이미 나와있는 목록에서 간추려야 함.

    }
}
