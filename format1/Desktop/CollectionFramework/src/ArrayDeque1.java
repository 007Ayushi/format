import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque ad1=new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        System.out.println(ad1);
        ad1.addFirst(300);
        ad1.addLast(400);
        System.out.println(ad1);
        ad1.offer(500);
        System.out.println(ad1);
        ad1.offerLast(600);
        System.out.println(ad1);
        ad1.offerFirst(10);
        System.out.println(ad1);

    }
}
