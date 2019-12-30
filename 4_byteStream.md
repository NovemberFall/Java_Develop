## available()
- Returns an estimate of the number of remaining bytes that can be read
```java
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
        FileInputStream fis = new FileInputStream("../tempfile/1.mp3");
        //Returns an estimate of the number of remaining bytes that can be read
        System.out.println(fis.available());

        fis.close();
    }
}
```
![](img/2019-12-29-16-51-55.png)
---
-
```java
    public static void main(String[] args) throws IOException {
        /**
         * available()
         */
        FileInputStream fis = new FileInputStream("../tempfile/1.mp3");
        //Returns an estimate of the number of remaining bytes that can be read
        // System.out.println(fis.available());

        byte[] buf = new byte[fis.available()]; //定义了一个刚刚好的数组. 注意：如果文件过大，容易溢出
                                                //建议缓冲区长度还是1024 整数倍
        String str = new String(buf);
        System.out.println(str);
        fis.close();
    }
```
![](img/2019-12-29-16-59-23.png)
- `FileInputStream fis = new FileInputStream("../tempfile/file.txt");`
![](img/2019-12-29-17-00-00.png)
---


### 删除一个带有内容的目录
- first create some files for testing:
![](img/2019-12-29-17-15-10.png)
- 主要思路： 是目录就递归，不是全删除
```java
import java.io.File;
/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 删除一个带有内容的目录
         * 1. 必须从里往外删
         * 2. 多少级目录不确定，Recursion
         * 3. 
         */
        File dir = new File("../E/test");
        // System.out.println(dir.delete());

        removeDir(dir);
    }
    /**
     * 删除一个目录
     */
    private static void removeDir(File dir) {
        //1. 列出当前目录下的文件以及文件夹file[]
        File[] files = dir.listFiles();

        for(File file: files){
            //2. 对遍历的对象进行判断是否是目录
            if(file.isDirectory()){
                removeDir(file);
            }else{
                System.out.println(file + ":"+file.delete());
            }
        }
        System.out.println(dir+":"+dir.delete());
    }
}
```
![](img/2019-12-29-17-26-43.png)
![](img/2019-12-29-17-27-04.png)
---

