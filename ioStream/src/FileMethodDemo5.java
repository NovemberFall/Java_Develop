import com.tom.io.file.FileFilterByDiretory;
import java.io.File;

public class FileMethodDemo5 {
    public static void main(String[] args) {
        File dir = new File("src/");

        File[] files = dir.listFiles(new FileFilterByDiretory());

        for (File file : files) {
            System.out.println(file);
        }
    }
}
