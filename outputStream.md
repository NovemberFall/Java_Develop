### java.io.OutputStream
- OutputStream: 输出字节流的super class
    1. 操作的数据是字节， 不管什么文件(CD,gif,png,txt...etc)
    2. 定义了输出字节流的基本性功能
    3. 输出流中定义的都是write methods
    4. 操作字节数据，操作单个字节
    5. subclass规律：所有subclass的名称suffix是super class'name. Direct Known Subclasses:`ByteArrayOutputStream, FileOutputStream, FilterOutputStream, ObjectOutputStream, OutputStream, PipedOutputStream`
    6. 前缀名是是这个流对象功能
    7. 想要操作文件：FileOutputStream

- create a new class
- FileOutputStreamDemo.java
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // write data into file
        //创建临时目录
        File dir = new File("tempfile");
        if (!dir.exists()) {
            dir.mkdir();
        }

        //创建存储数据的文件
        File file = new File(dir, "file.txt");

        //创建一个用于操作文件的字节输出流对象，一创建就必须明确数据存储目的地
        FileOutputStream fos = new FileOutputStream(file);   
    }
}
```
- running
![](img/2019-12-29-11-12-25.png)
- there is new foler `tempfile/file.txt`
- 