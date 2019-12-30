import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * CopyFileByBuffer
 */
public class CopyFileByBuffer {

    public static void main(String[] args) throws IOException {
        /**
         * 复制文件
         */
        //1.明确源文件，和目的文件
        File srcFile = new File("../tempfile/1.mp3");
        File destFile = new File("../tempfile/copy_1.mp3");

        //2.明确字节输入流和源相关联，输出流和目的相连
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        //3. 定义一个缓冲区
        byte[] buffer = new byte[1024];

        int len = 0;
        while((len = fis.read(buffer))!=-1){
            fos.write(buffer, 0, len);//将数组中中的指定长度的数据写入到输出流中
        }

        //4.close
        fos.close();
        fis.close();
    }
}