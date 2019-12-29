// import java.io.File;
// import java.io.FileInputStream;
// import java.io.IOException;

// /**
//  * FileInputStreamDemo2
//  */
// public class FileInputStreamDemo2 {
//     public static void main(String[] args) throws IOException {
//         /**
//          * 2nd way to read; read(byte[])
//          */
//         File file = new File("../tempfile/file1.txt");

//         FileInputStream fis = new FileInputStream(file);

//         //创建一个字节数组
//         byte[] buffer = new byte[2];

//         int len1 = fis.read(buffer);//read(byte[] b), return the total number of bytes read into the buffer,
//         System.out.println(len1 + ":" + new String(buffer));

//         int len2 = fis.read(buffer);//read(byte[] b), return the total number of bytes read into the buffer,
//         System.out.println(len2 + ":" + new String(buffer));

//         int len3 = fis.read(buffer);//read(byte[] b), return the total number of bytes read into the buffer,
//         System.out.println(len3 + ":" + new String(buffer));

//         int len4 = fis.read(buffer);//read(byte[] b), return the total number of bytes read into the buffer,
//         System.out.println(len4 + ":" + new String(buffer));
//     }
    
// }



























import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//int read(byte[] b)
/**
 * FileInputStreamDemo2
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /**
         * 2nd way to read; read(byte[])
         */
        File file = new File("../tempfile/file1.txt");

        FileInputStream fis = new FileInputStream(file);

        //创建一个字节数组
        byte[] buffer = new byte[2];

        int len = 0;
        while((len=fis.read(buffer)) != -1){
            System.out.println(new String(buffer, 0, len));
        }

        fis.close();
    }
    
}