package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入书名");
        String name = scanner.nextLine();
        System.out.println("输入作者");
        String author = scanner.nextLine();
        System.out.println("输入价格");
        int price = scanner.nextInt();
        System.out.println("输入类型");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        int curSize = bookList.getUsedSize();
        bookList.setBook(book,curSize);
        bookList.setUsedSize(curSize+1);
        System.out.println("已增加");



    }
}
