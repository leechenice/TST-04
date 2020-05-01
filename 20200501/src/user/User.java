package user;

import book.BookList;
import operation.IOperation;

public abstract class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();

    public void DoOperation(BookList bookList,int choice) {
        iOperations[choice].work(bookList);
    }



}
