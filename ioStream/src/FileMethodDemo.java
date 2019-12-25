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
