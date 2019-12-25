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
