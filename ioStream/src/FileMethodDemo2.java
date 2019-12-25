import java.io.File;
import java.io.IOException;

public class FileMethodDemo2 {
    public static void main(String[] args) throws IOException {
        //file and folder

//        File file = new File("src/file.txt");
//
//        boolean b1 = file.createNewFile();
//        System.out.println("b1 = " + b1);
//
//        boolean b2 = file.delete();
//        System.out.println("b2 = " + b2);






//        File file = new File("src/file.txt");
//        file.createNewFile();
//
//        boolean b3 = file.exists();
//        System.out.println(b3);





//        //对目录操作创建，删除，判断
//        File dir = new File("src/abc");
//        boolean b4 = dir.mkdir();
//        System.out.println("b4 = " + b4);




//        //创建多级目录
//        File dir = new File("src/abc/def/ghj/klm/nop");
//        boolean b5 = dir.mkdirs();//创建多级目录
//        System.out.println("b5 = " + b5);
//
//        boolean b6 = dir.delete();//删除目录时，如果目录中有内容，无法直接删除。只有将目录中的内容都删除后，
//        //保证该目录为空，这时这个目录才可以删除
//        System.out.println("b6 = " + b6);






//        System.out.println("***********************************");
//        File f = new File("src/java.txt");
//        f.createNewFile();
//        System.out.println(f.isFile());
//        System.out.println(f.isDirectory());




        System.out.println("***********************************");
        File f = new File("src/java.txt");
        f.mkdir();
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
    }
}
