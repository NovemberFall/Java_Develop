import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // write data into file
        //创建临时目录
        File dir = new File("tempfile");
        if (!dir.exists()) {
            dir.mkdir();
        }

        //创建存储数据的文件
        File file = new File(dir, "file.txt");

        //创建一个用于操作文件的字节输出流对象，一创建就必须明确数据存储目的地
        //输出流目的是文件，会自动创建。 如果文件存在则覆盖
        FileOutputStream fos = new FileOutputStream(file);

        //call superclass(OutputStream)'s write() method
        byte[] data = "abcdef".getBytes();
        fos.write(data);

        //close system source
        fos.close();
    }
}