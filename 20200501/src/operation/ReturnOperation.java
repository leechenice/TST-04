package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入书名");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name) && book.isBorrowed()){
                book.setBorrowed(false);
                System.out.println("已被归还");
                return;
            }
            if(book.getName().equals(name) && !book.isBorrowed()){
                System.out.println("没借还个锤子");
            }
        }
        System.out.println("查无此书");

    }
}
