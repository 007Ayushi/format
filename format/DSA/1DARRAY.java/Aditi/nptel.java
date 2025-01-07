
import java.io.*;
import java.util.Scanner;
public class nptel {
    public static char calculatescore(int g)
    {
        if(g>=80) return 'A';
        if(g>=70 && g<=79) return 'B';
        if (g>=60 && g<=69) return 'C';
        if(g>=50 && g<=59) return 'D';
        if(g>=40 && g<=49) return 'P';
        if (g<40) return 'F';
        return 'e';

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        if(g>=100 && g<0) return;
        char grade =calculatescore(g);
        System.out.println(grade);    
}
}
