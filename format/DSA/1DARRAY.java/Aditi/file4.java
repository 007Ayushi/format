package Aditi;

import java.io.IOException;
import java.io.*;
public class file4 {
    public static void main(String[] args)throws IOException {
        File dir=new File("aditi1");
        File files=new File(dir,"files");
        FileWriter fw=new FileWriter("files");
        fw.write("pw");
        fw.write("65");
        fw.write("24");
        char ch[]={'e','r','u'};
        fw.write(ch);
        fw.close();
    }
    
}
