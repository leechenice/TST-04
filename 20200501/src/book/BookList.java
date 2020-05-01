package book;

public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public BookList() {
        books[0] = new Book("a","b",1,"c");
        this.usedSize = 1;
    }

    public void setBook(Book book,int q) {
        this.books[q] = book;
    }

    public Book getBook(int q) {
        return books[q];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
