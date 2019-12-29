import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStreamDemo
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("../tempfile/file.txt");

        //创建一个字节输入流对象,必须明确数据源，其实就是创建字节读取流和数据源相关
        FileInputStream fis = new FileInputStream(file);

        //读取数据 使用read(); 一次读一个字节
        // int ch1 = fis.read();//97
        // System.out.println("ch1="+(char)ch1 );
        // int ch2 = fis.read();//98
        // System.out.println("ch2="+(char)ch2 );
        // int ch3 = fis.read();
        // System.out.println("ch3="+(char)ch3 );
        // int ch4 = fis.read();
        // System.out.println("ch4="+(char)ch4 );
        // int ch5 = fis.read();
        // System.out.println("ch5="+(char)ch5 );
        
        int ch=0;
        while((ch=fis.read()) != -1){
            System.out.println("ch="+ (char)ch);
        }
        if((ch=fis.read()) == -1){
            System.out.println(ch);
        }
        fis.close();
    }
}