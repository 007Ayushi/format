public class CircularQueue {
    public static class arrayqueue{
        int front=-1;
        int rear=-1;
        int size=0;
        int []arr=new int[8];
        int n=arr.length;
        void add(int x)throws  Exception{
            if(size==n){
//                System.out.println("queue is full");
//                return;
                throw new Exception("queue is full");
            }
          else if(size==0){
                front=rear=0;
                arr[0]=x;
            }

            else if(rear<n-1){
                arr[++rear]=x;
           }
            else if(rear==n-1){
                rear=0;
                arr[0]=x;
           }
            size++;
        }
        int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            else if(front==n-1){
                int val=arr[front];
                front=0;
                size--;
                return val;

            }
            else{
                int val=arr[front];
                front++;
                size--;
                return val;

            }

        }
        int peek() throws  Exception {
            if(size==0)throw new Exception("size is empty");
            return arr[front];
        }
        void display(){
            if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.println(arr[i]+" ");
                }
            }
           else {
                for(int i=front;i<=n-1;i++){
                    System.out.println(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }

    public static void main(String[] args) throws  Exception {
       arrayqueue ar=new arrayqueue();
       ar.add(10);
       ar.add(20);
       ar.add(30);
       ar.add(40);
       ar.display();
       System.out.println("peeked element is"+ar.peek());
       ar.remove();
       ar.display();

    }
}
