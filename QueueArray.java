 
import java.util.Scanner;

public class QueueArray{
   public static void main(String[] args){
      Scanner rd = new Scanner(System.in);
      System.out.print("\nEnter the size of queue: ");
      int size = rd.nextInt();
      Queue Q = new Queue(size);
      while(true){
         System.out.println("\n1)Enqueue 2)Dequeue 3)Display 4)IsEmpty 5)IsFull");
         System.out.print("Select operation: ");
         int op = rd.nextInt();
         switch(op){
            case 1: System.out.print("Enter the element to enqueue: ");
                    int data = rd.nextInt();
                    Q.enqueue(data);
                    break;
            case 2: Q.dequeue();
                    break;
            case 3: Q.display();
                    break;
            case 4: System.out.println("The queue is empty: "+Q.isEmpty());
                    break;
            case 5: System.out.println("The queue is full: "+Q.isFull());
                    break;
            case 6: System.exit(0);
            default: System.out.println("Enter a valid operation between 1-6!");
         }
      }
   }
}

class Queue{
   int rear=-1;
   int front=0;
   int size;
   int q[];
   
   Queue(int size){
      this.size = size;
      q = new int[size]; 
   }
   
   public boolean isFull(){
      if(rear==size-1) return true;
      return false;
   }
   
   
   public boolean isEmpty(){
      if(rear!=size-1) return true;
      return false;
   }
   
   public void enqueue(int data){
      if(isFull()) System.out.println("Queue Overflow");
      else{
         q[++rear]=data;
      }
   }
   
   public void dequeue(){
      if(rear==-1||front>rear) System.out.println("Queue Underflow");
      else{
         System.out.printf("Element poped is: "+ q[front++]);
      }
   }
   
   public void display(){
      if(rear==-1||front>rear)System.out.println("Queue is empty!");
      else{
         System.out.print("Elements in queue: ");
         for(int i=rear; i>=front; i--) System.out.print(q[i]+" ");
      }
   }
}
