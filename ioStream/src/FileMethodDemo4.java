import com.tom.io.file.FilenameFilterByJava;

import java.io.File;

public class FileMethodDemo4 {
    public static void main(String[] args) {
//        //获取目录中的内容，但是只要java文件
//        File dir = new File("src/");
//
//        File[] files = dir.listFiles();
//        for (File file : files) {
//            if (file.getName().endsWith(".java")) {
//                System.out.println(file.getName());
//            }
//        }




        //获取目录中的内容，但是只要java文件
        File dir = new File("src/");

        File[] files = dir.listFiles(new FilenameFilterByJava());
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
