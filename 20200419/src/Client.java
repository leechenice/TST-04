//测试类
public class Client {

    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt(System.getProperty("user.dir") +
                        "\\src\\facade\\src.txt",
                       System.getProperty("user.dir") +
                        "/src/facade/des.txt");
    }
}

