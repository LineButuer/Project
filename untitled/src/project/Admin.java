package project;

import project.book.BookService;

import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("선택");
        int select=scanner.nextInt();
        if(select==1){
            bookService.save();
        }
    }
}
