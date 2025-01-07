import java.io.*;
public class file3 {
    public static void main(String[] args)throws IOException{
        File dir=new File("Aditi");
        dir.mkdirs();
        File file=new File(dir,"folders");
        file.createNewFile();
        System.out.println(file.exists());
        
    }
    
}
