import java.io.FileInputStream;
import java.io.IOException;

/**
 * byteStream_avaliable
 */
public class byteStream_avaliable {

    public static void main(String[] args) throws IOException {
        /**
         * available()
         */
        FileInputStream fis = new FileInputStream("../tempfile/file.txt");
        //Returns an estimate of the number of remaining bytes that can be read
        // System.out.println(fis.available());

        byte[] buf = new byte[fis.available()]; //定义了一个刚刚好的数组. 注意：如果文件过大，容易溢出
                                                //建议缓冲区长度还是1024 整数倍
        fis.read(buf);
        String str = new String(buf);
        System.out.println(str);
        fis.close();
    }
}