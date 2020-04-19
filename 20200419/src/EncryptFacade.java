//外观类：完成文件读取、加密和保存三个操作

class EncryptFacade {

    private final FileReader reader;
    private final CipherMachine cipher;
    private final FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc,String fileNameDes){
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
