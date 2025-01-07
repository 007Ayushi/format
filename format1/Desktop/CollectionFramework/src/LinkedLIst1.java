import java.util.LinkedList;
class LinkedList1{
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();//homogeneous linked list
        l1.add(100);
        l1.add(200);
        l1.add(300);
        System.out.println(l1);

        LinkedList l2=new LinkedList();//heterogeneous linked list
        l2.add("ayushi gupta");
        l2.add("linked list");
        System.out.println(l2);
        l2.add("ayuhsiii");

        LinkedList l3=new LinkedList();
        l3.add(10);
        l3.add(20);
        l3.add("ayuhsi gupta");
        l3.add("20");
        System.out.println(l3);
        l3.addFirst("amity university");
        System.out.println(l3);
        l3.add(2,"ayushi gupta student");
        System.out.println(l3);
        l3.addLast("exams coming soon");
        System.out.println(l3);
        System.out.println(l3.peek());
        System.out.println(l3.poll());
        System.out.println(l3);
        System.out.println(l3.get(1));
        LinkedList l4=new LinkedList();
        l4.add(200);
        l4.add(100);
        l4.add(200);
        System.out.println(l4);
        System.out.println(l4.indexOf(200));
        System.out.println(l4.lastIndexOf(200));
        System.out.println(l4.getFirst());
        System.out.println(l4.getLast());
        l4.push(1000);
        System.out.println(l4);
        System.out.println(l4.pop());
    }

}