import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 文件读取类：子系统类

class FileReader {

    public String read(String fileNameSrc) {

        System.out.println("读文件...获取明文");
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream inFS = new FileInputStream(fileNameSrc);
            int data;
            while ((data=inFS.read())!=-1) {
                sb.append((char) data);
            }
            inFS.close();
        } catch (FileNotFoundException e) {

            System.out.println("文件不存在！");
        } catch (IOException e) {

            System.out.println("文件操作失败！");
        }
        return sb.toString();
    }
}

