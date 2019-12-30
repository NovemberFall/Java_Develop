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