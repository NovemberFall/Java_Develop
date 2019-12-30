// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;

// /**
//  * CopyFileTest
//  */
// public class CopyFileTest {

//     public static void main(String[] args) throws IOException {
//         /**
//          * 复制文件
//          */
//         //1.明确源文件，和目的文件
//         File srcFile = new File("../tempfile/file.txt");
//         File destFile = new File("../tempfile/copy_file.txt");

//         //2.明确字节输入流和源相关联，输出流和目的相连
//         FileInputStream fis = new FileInputStream(srcFile);
//         FileOutputStream fos = new FileOutputStream(destFile);

//         //3. 使用输入流的读取方法读取字节，并将字节写入到目的中
//         int ch=0;
//         while((ch=fis.read())!=-1){
//             fos.write(ch);
//         }

//         //4.close
//         fos.close();
//         fis.close();
//     }
// }

























//复制 .mp3
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * CopyFileTest
 */
public class CopyFileTest {

    public static void main(String[] args) throws IOException {
        /**
         * 复制文件
         */
        //1.明确源文件，和目的文件
        File srcFile = new File("../tempfile/1.mp3");
        File destFile = new File("../tempfile/copy_2.mp3");

        //2.明确字节输入流和源相关联，输出流和目的相连
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        //3. 使用输入流的读取方法读取字节，并将字节写入到目的中
        int ch=0;
        while((ch=fis.read())!=-1){
            fos.write(ch);
        }

        //4.close
        fos.close();
        fis.close();
    }
}