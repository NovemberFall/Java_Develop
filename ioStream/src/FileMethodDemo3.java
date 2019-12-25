import java.io.File;

public class FileMethodDemo3 {
    public static void main(String[] args) {
        //对给定的目录，获取内部的内容
        File dir = new File("/Users/Git/gitjavaoo/ioStream/");

        String[] names = dir.list();//获取的是目录下的当前文件以及文件夹names
        for (String name : names) {
//            System.out.println(name);
        }

        File[] files = dir.listFiles();//获取目录下的当前文件以及文件夹的对象
        for (File file : files) {
            System.out.println(file.lastModified());
        }
    }
}
