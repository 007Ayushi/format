
import java.util.ArrayList;
import java.util.*;
//public class ArrayList1 {
//    public static void main(String[] args) {
//        ArrayList al1=new ArrayList();//it can store homogeneous datas
//        al1.add(100);
//        al1.add(200);
//        al1.add(300);
//        System.out.println(al1);
//
//        ArrayList al2=new ArrayList();//it can store heterogeneous datas
//        al2.add("ayushi");
//        al2.add("gupta");
//        al2.add("software engineer");
//        al2.add("yushi");
//        System.out.println(al2);
//
//        al2.add(al1);//we can add one collection to other collection too.
//        System.out.println((al2));
//        System.out.println(al2.contains(100));//contains methods returns boolean value
//
//        int index=al2.indexOf("ayushi");
//        System.out.println(index);
//        System.out.println(al2.size());
//
//        al2.ensureCapacity(10);
//        System.out.println(al2);
//        al2.trimToSize();
//        System.out.println(al2.size());
//        al2.clear();
//        System.out.println(al2);
//        List al3=new ArrayList<>();
//        al3.add(100);
//        System.out.println(al3);
//        System.out.println(al3.size());
//
//    }
//}

import java.util.ArrayList;
class ArrayList1{
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        System.out.println(al1);

        ArrayList al2=new ArrayList();
        al2.add("ayushi gupta");
        al2.add("software Engineer");
        al2.add(" ");
        System.out.println(al2);

        al2.add(al1);
        System.out.println(al2);

        al2.add(3,"ayushi's sister is aditi");
        System.out.println(al2);

        System.out.println(al1.contains(100));
        int index=al2.indexOf(400);
        System.out.println(index);
        System.out.println(al1.size());

        al2.ensureCapacity(10);
        System.out.println(al2.size());


        al2.trimToSize();
        System.out.println(al2.size());
        List al3=new ArrayList();
        al3.add(1000);
        System.out.println(al3);

    }
}

