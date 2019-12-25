```java
import java.io.File;
public class FileDemo {

    public static void main(String[] args) {
        String pathName = "/Users/Git/gitjavaoo/ioStream/test.java";
        File file = new File(pathName);//将test文件，封装成file对象
        System.out.println(file);

        File f2 = new File("/Users/Git/gitjavaoo/ioStream/", "test.java");
        System.out.println(f2);

        //将parent封装成file object
        File dir = new File("/Users/Git/gitjavaoo/ioStream/");
        File f3 = new File(dir, "test.java");
        System.out.println(f3);

    }
}
```
![](img/2019-12-25-01-16-58.png)
- **Notice, if a file doesn't exist, the system will create a new file for you** 
---

## file method get()
```java
import java.io.File;

public class FileMethodDemo {

    public static void main(String[] args) {
        /*
        get the info, name, size, time of a file
         */
        File file = new File("hello.txt");
        System.out.println(file.getAbsolutePath());
    }
}
```
![](img/2019-12-25-01-31-23.png)
---

```java
import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {

    public static void main(String[] args) {
        //get the info, name, size, time of a file

//        File file = new File("/Users/Git/gitjavaoo/ioStream/src/test.java");
        File file = new File("src/test.java");

        String absPath = file.getAbsolutePath();
        String path = file.getPath();//相对路径
        String fileName = file.getName();

        long size = file.length();
        long time = file.lastModified();

        System.out.println("Absolute Path: " + absPath);
        System.out.println("path: " + path);
        System.out.println("fileName: " + fileName);
        System.out.println("size: " + size);
        System.out.println("time: " + time);

        //convert millisecond to second
        String str_date = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(new Date(time));
        System.out.println(str_date);
    }
}
```
![](img/2019-12-25-11-11-14.png)
---

## File class, file and folder
```java
public class FileMethodDemo2 {
    public static void main(String[] args) throws IOException {
        //file and folder
       File file = new File("src/file.txt");

       boolean b1 = file.createNewFile();
       System.out.println("b1 = " + b1);

       boolean b2 = file.delete();
       System.out.println("b2 = " + b2);

    }
}
```
![](img/2019-12-25-11-54-08.png)
---

```java
public class FileMethodDemo2 {
    public static void main(String[] args) throws IOException {
        //file and folder

        File file = new File("src/file.txt");
        file.createNewFile();

        boolean b3 = file.exists();
        System.out.println(b3);
    }
}
```
![](img/2019-12-25-11-55-09.png)
---

```java
        //对目录操作创建，删除，判断
        File dir = new File("src/abc");
        boolean b4 = dir.mkdir();
        System.out.println("b4 = " + b4);
```
- output: true
![](img/2019-12-25-11-58-12.png)
---

```java
        //创建多级目录
        File dir = new File("src/abc/def/ghj/klm/nop");
        boolean b5 = dir.mkdirs();////创建多级目录
        System.out.println("b5 = " + b5);

```
![](img/2019-12-25-12-02-30.png)
---

```java
        //创建多级目录
        File dir = new File("src/abc/def/ghj/klm/nop");
        boolean b5 = dir.mkdirs();//创建多级目录
        System.out.println("b5 = " + b5);

        boolean b6 = dir.delete();//删除目录时，如果目录中有内容，无法直接删除。只有将目录中的内容都删除后，
        //保证该目录为空，这时这个目录才可以删除
        System.out.println("b6 = " + b6);
```
![](img/2019-12-25-12-09-07.png)
- 这里必须注意：只有删除里面的内容，利用递归，才可以完全删除
- 在windows, 是用c++ 封装了删除，从里往外删除，为了方便用户
---

### 在判断一个文件，必须保证其是存在的
```java
        System.out.println("***********************************");
        File f = new File("src/java.txt");
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
```
![](img/2019-12-25-12-17-11.png)
- 所以必须先创建
- update 
```java
       System.out.println("***********************************");
       File f = new File("src/java.txt");
       f.createNewFile();
       System.out.println(f.isFile());
       System.out.println(f.isDirectory());
```
---

## listFiles() 
```java
import java.io.File;

public class FileMethodDemo3 {
    public static void main(String[] args) {
        //对给定的目录，获取内部的内容
        File dir = new File("/Users/Git/gitjavaoo/ioStream/");

        String[] names = dir.list();//获取的是目录下的当前文件以及文件夹names
        for (String name : names) {
            System.out.println(name);
        }
    }
}
```
![](img/2019-12-25-12-29-07.png)
---

```java
        File[] files = dir.listFiles();//获取目录下的当前文件以及文件夹的对象
        for (File file : files) {
            System.out.println(file.lastModified());
        }
```
![](img/2019-12-25-12-32-53.png)
---


## File class, filter过滤器
```java
import java.io.File;

public class FileMethodDemo4 {
    public static void main(String[] args) {
        //获取目录中的内容，但是只要java文件
        File dir = new File("src/");

        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
/* 
file.txt
abc
java.txt
.DS_Store
FileMethodDemo4.java
test.java
FileDemo.java
FileMethodDemo.java
FileMethodDemo2.java
FileMethodDemo3.java
 */
```
-
- 假如希望只要.java后缀名
```java
        //获取目录中的内容，但是只要java文件
        File dir = new File("src/");

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".java")) {
                System.out.println(file.getName());
            }
        }

/* 
FileMethodDemo4.java
test.java
FileDemo.java
FileMethodDemo.java
FileMethodDemo2.java
FileMethodDemo3.java
 */        
```
- but the problem is: the codes are hard codes
- 
- create a new package
![](img/2019-12-25-12-51-10.png)
```java
package com.tom.io.file;
import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterByJava implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java");
    }
}
```
- FilenameFilterByJava override accept() method
- update FileMethodDemo4.java
```java
import com.tom.io.file.FilenameFilterByJava;

import java.io.File;

public class FileMethodDemo4 {
    public static void main(String[] args) {

        //获取目录中的内容，但是只要java文件
        File dir = new File("src/");

        File[] files = dir.listFiles(new FilenameFilterByJava());
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
```
![](img/2019-12-25-12-52-41.png)

