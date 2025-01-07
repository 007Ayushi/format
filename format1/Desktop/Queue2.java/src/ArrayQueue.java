public class ArrayQueue {
    static class arQueue{
        int f=-1;
        int r=-1;
        int size=0;
        int []arr=new int[5];

       public void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            else if(f==-1 && r==-1){
                f=r=0;
                arr[r]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }
        int remove(){
            if(f==-1 && r==-1){
                System.out.println("queue is empty");
                return -1;
            }
           int val=arr[f++];
            size--;
            return val;
        }
         public int peek(){
           if(size==0){
               System.out.println("queue is empty");
           }
               int val=arr[f];
               return val;

        }
       boolean isEmpty(){
          if(size==0)
              return true;
          return false;
       }
        void display(){
            for(int i=f;i<=r;i++){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        arQueue aq=new arQueue();
        System.out.println(aq.isEmpty());
        aq.add(2);
        aq.add(3);
        System.out.println(aq.isEmpty());
        aq.display();
        System.out.println(aq.isEmpty());
        aq.remove();
        aq.display();
        System.out.println(aq.peek());
        System.out.println(aq.isEmpty());

    }
}
