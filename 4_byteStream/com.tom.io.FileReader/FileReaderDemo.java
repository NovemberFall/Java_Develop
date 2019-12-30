import java.io.FileReader;
import java.io.IOException;

/**
 * FileReaderDemo
 * 
 * java.io.Reader: 字符输入流，是字符输入流的最顶层的superclass, 定义了一些共性的成员方法，是一个抽象类
 * 
 * 共性的成员方法：
 * int read() ，读取单个字符并返回
 * int read(char[] chuf) 一次读取多个字符，将字符读入数组
 * void close() 关闭
 * 
 * java.io.FileReader extends InputStreamReader extends Reader
 * FileReader: 文件字符输入流
 * 作用：把硬盘文件中的数据以字符的方式读取到内存中
 * 
 * constructor:
 * FileReader(String filename)
 * FileReader(File file)     
 * param: 读取文件的数据源
 *      String filename: 文件路径
 *      File file: 一个文件
 * FileReader constructor的作用：
 *      1. 创建一个FileReader object
 *      2. 会把FileReader对象指向要读取的文件
 * 
 * 字符输入流的使用步骤：
 *      1. create FileReader object, constructor方法中绑定要读取的数据源
 *      2. 使用filereader object中的方法read()读取文件
 *      3. close（）
 */
// public class FileReaderDemo {

//     public static void main(String[] args) throws IOException {
//         //create FileReader object,
//         FileReader fr = new FileReader("../tempfile/file.txt");
//         int len = 0;
//         while((len = fr.read()) != -1){
//             System.out.println((char)len);
//         }
//         fr.close();
//     }
// }


















//int read(char[] chuf) 一次读取多个字符，将字符读入数组
public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
        //create FileReader object,
        FileReader fr = new FileReader("../tempfile/file.txt");

        //int read(char[] chuf) 一次读取多个字符，将字符读入数组
        char [] cs = new char[1024];//分配1024的倍数，存储读取到的多个字符
        int len = 0;//记录的是每次读取的有效字符个数
        while((len = fr.read(cs))!=-1){

            System.out.println(new String(cs, 0, len));
        }

        fr.close();
    }
}