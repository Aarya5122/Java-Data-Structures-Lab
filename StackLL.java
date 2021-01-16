import java.util.Scanner;

public class StackLL{
   public static void main(String[] args){
      Scanner rd = new Scanner(System.in);
      System.out.print("\nEnter the size of stack: ");
      int size = rd.nextInt();
      Stack S = new Stack(size);
      while(true){
         System.out.println("\n1)push 2)pop 3)Display 4)IsEmpty 5)IsFull 6)Exit");
         System.out.print("Select operation: ");
         int op = rd.nextInt();
         switch(op){
            case 1: System.out.print("Enter the element to enqueue: ");
                    int data = rd.nextInt();
                    S.push(data);
                    break;
            case 2: S.pop();
                    break;
            case 3: S.display();
                    break;
            case 4: System.out.println("The queue is empty: "+S.isEmpty());
                    break;
            case 5: System.out.println("The queue is full: "+S.isFull());
                    break;
            case 6: System.exit(0);
            default: System.out.println("Enter a valid operation between 1-6!");
         }
      }
   }
}

class Stack{
   int data,size,top=-1;
   Stack next;
   Stack(){
      data=0;
      next=null;
   }
   Stack(int size){
      data=0;
      next=null;
      this.size=size;
   }
   Stack head=null;
   
   public boolean isEmpty(){
      if(head==null) return true;
      return false;
   }
   
   public boolean isFull(){
      if(top==(size-1)) return true;
      else return false;
   }
   
   public void push(int data){
      if(isFull()) System.out.println("Stack Overflow!");
      else if(head==null){
         Stack NS = new Stack();
         NS.data=data;
         head=NS;
         top++;
      }
      else{
         Stack NS = new Stack();
         NS.data=data;
         Stack t = head;
         while(t.next!=null){
            t=t.next;
         }
         t.next=NS;
         top++;
      }
   }
   
   public void pop(){
      if(isEmpty()) System.out.println("Stack Underflow!");
      else if(head.next==null){
         System.out.println("Element poped is: "+head.data);
         head=null;
         top--;
         }
      else{
         Stack t = head;
         Stack bt = t;
         while(t.next!=null){
            bt=t;
            t=t.next;
         }
         System.out.println("Element poped is: "+t.data);
         bt.next=null;
         top--;
      }
   }
   
   public void display(){
      if(isEmpty()) System.out.println("Stack is empty!");
      else if(head.next==null){
         System.out.println("Elements in stack: "+head.data);
      }
      else{
         System.out.print("Elements in stack: ");
         Stack t = head;
         while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
         }
      }
   }
   
}
