
import com.tom.io.file.FilenameFilterBySuffix;

import java.io.File;

public class FileMethodDemo04 {
    public static void main(String[] args) {
        //获取目录中的内容，但是只要java文件
        File dir = new File("src/");

        File[] files = dir.listFiles(new FilenameFilterBySuffix(".txt"));
/* listFiles源码
        public File[] listFiles(FilenameFilter filter) {
            String ss[] = list();
            if (ss == null) return null;
            ArrayList<File> files = new ArrayList<>();
            for (String s : ss)
                if ((filter == null) || filter.accept(this, s))
                    files.add(new File(s, this));
            return files.toArray(new File[files.size()]);
        }
*/

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
