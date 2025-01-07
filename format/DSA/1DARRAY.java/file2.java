import java.io.*;
public class file2 {
    public static void main(String[] args)throws IOException {
        File dir=new File("ad.txt");
        System.out.println(dir.exists());
        dir.mkdirs();
        System.out.println(dir.exists());
        
    }
    
}
