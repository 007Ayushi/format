import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(100);
        ts.add(200);
        ts.add(300);
        System.out.println(ts);
        System.out.println(ts.higher(200));
        System.out.println(ts.lower(100));
        System.out.println(ts.ceiling(100));
        System.out.println(ts.floor(50));
    }
}
