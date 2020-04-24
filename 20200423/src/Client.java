//客户端测试类
class Client {
    public static void main(String[] args) {
        Account acc = new Account("段誉",5);
        acc.deposit(100);
        acc.withdraw(200);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.withdraw(100);

    }
}
