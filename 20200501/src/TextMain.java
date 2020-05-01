import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class TextMain {

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = scanner.nextLine();
        System.out.println("输入 1.管理员 任意键.普通用户");
        int choice = scanner.nextInt();
        if (choice == 1){
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();
        //登录
        User user = login();
        //选择方法
        while (true) {
            int choice = user.menu();

            user.DoOperation(bookList, choice);
        }
    }
}
