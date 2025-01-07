import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(200);
        System.out.println(al1);
//        for(int i=0;i< al1.size();i++){
            //Object o=al1.get(i);
            //System.out.println(o);
//            System.out.println(al1.get(i));
//
//        }
        //for each loop
//        for(Object o:al1){
//            System.out.println(o);
//        }

//        Iterator itr=al1.iterator();
//        while(itr.hasNext()){
//            Integer i=(Integer)itr.next();
//            //System.out.println(i);
//            System.out.println(itr.next());
//        }
        ListIterator litr=al1.listIterator(al1.size());
        while(litr.hasPrevious()){
                System.out.println(litr.previous());
            }
        }
    }

