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
        //输出流目的是文件，会自动创建。 如果文件存在则覆盖        
        FileOutputStream fos = new FileOutputStream(file);   
    }
}
```
- running
![](img/2019-12-29-11-12-25.png)
- there is new foler `tempfile/file.txt`
-
- try to write bytes to file
- update
```java
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
```
![](img/2019-12-29-11-18-17.png)
![](img/2019-12-29-11-19-49.png)
---


### 字节输出流 ｜ 续写& change new line
```java
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * FileOutputStreamDemo2
 */
public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //将数据续写到已有的文件中
        //public FileOutputStream(File file, boolean append) 
        //If the second argument is true, then bytes will be written to the end of the file rather than the beginning

        File file = new File("../tempfile/file.txt");

        FileOutputStream fos = new FileOutputStream(file, true);

        fos.write("Hello World!".getBytes());
        
        fos.close();
    }
}
```
![](img/2019-12-29-11-30-35.png)
---
-
- change line
- FileOutputStreamDemo2.java
```java
    public static void main(String[] args) throws IOException {
        //将数据续写到已有的文件中
        //public FileOutputStream(File file, boolean append) 
        //If the second argument is true, then bytes will be written to the end of the file rather than the beginning

        //换行，写入新数据

        File file = new File("../tempfile/file.txt");

        FileOutputStream fos = new FileOutputStream(file, true);

        // fos.write("Hello World!".getBytes());
        fos.write("\rjava".getBytes());
        
        fos.close();
    }
``` 
![](img/2019-12-29-11-34-51.png)
-
- 2nd way
```java
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
```
![](img/2019-12-29-11-43-42.png)
- note: for `System.getProperty()`, its keys:
![](img/2019-12-29-11-50-26.png)
---

