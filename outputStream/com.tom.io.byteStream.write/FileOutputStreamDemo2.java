import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// /**
//  * FileOutputStreamDemo2
//  */
// public class FileOutputStreamDemo2 {
//     public static void main(String[] args) throws IOException {
//         //将数据续写到已有的文件中
//         //public FileOutputStream(File file, boolean append) 
//         //If the second argument is true, then bytes will be written to the end of the file rather than the beginning

//         //换行，写入新数据

//         File file = new File("../tempfile/file.txt");

//         FileOutputStream fos = new FileOutputStream(file, true);

//         // fos.write("Hello World!".getBytes());
//         fos.write("\rjava".getBytes());
        
//         fos.close();
//     }
// }























//change new line
/**
 * FileOutputStreamDemo2
 */
public class FileOutputStreamDemo2 {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        //将数据续写到已有的文件中
        //public FileOutputStream(File file, boolean append) 
        //If the second argument is true, then bytes will be written to the end of the file rather than the beginning

        //换行，写入新数据

        File file = new File("../tempfile/file.txt");

        FileOutputStream fos = new FileOutputStream(file, true);

        String str = LINE_SEPARATOR +"change line";
        fos.write(str.getBytes());
        
        fos.close();
    }
}