package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入书名");
        String name = scanner.nextLine();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }

        }
        if (i == bookList.getUsedSize()) {
            System.out.println("查无此书");
        }
        for (int j = i; j < bookList.getUsedSize() - 1; j++) {
            Book book = bookList.getBook(i + 1);
            bookList.setBook(book,i);
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("已删除");
    }
}
