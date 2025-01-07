import java.io.*;
public class file1 {
    public static void main(String[] args)throws IOException {
        File f=new File("folder.txt");
        System.out.println(f.createNewFile());
        System.out.println(f.exists());
    }
}
