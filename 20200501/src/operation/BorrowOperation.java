package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入借阅书名");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name) && !book.isBorrowed()){
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
            if(book.getName().equals(name) && book.isBorrowed()){
                System.out.println("已被借出");
            }
        }
        System.out.println("查无此书");

    }
}
