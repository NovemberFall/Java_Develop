package com.tom.io.file;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        /*
         *file类的listFiles() 列出当前目录下文件以及文件夹
         *列出当前目录下的子目录中的所有内容
         *
         * 1。 在遍历当前目录时，会获取当前所有文件以及文件夹
         * 2。 要遍历子目录需要对获取到的当前的file对象进行判断，只有是目录才可以作为子目录继续遍历
         */
        File dir = new File("/Users/Git/gitjavaoo/ioStream1/");
        listAll(dir);
    }

    private static void listAll(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {//if current file is directory, continue traversing
                listAll(file);
            }
            System.out.println(file.getName());
        }
    }
}
