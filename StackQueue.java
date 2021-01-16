import java.util.Scanner;

public class StackQueue
{
	public static void main(String[] args) {
		Scanner rd= new Scanner(System.in);
		System.out.print("\nEnter the size of stack: ");
		int size=rd.nextInt();
		Stack S = new Stack(size);
		while(true){
		   System.out.println("\n1)Push 2)Pop 3)Display 4)IsEmpty 5)isFull 6)Exit");
		   System.out.print("Select the operation:");
	   	int op = rd.nextInt();
		   switch(op){
		      case 1: System.out.print("Enter the value to be pushed: ");
		              int data = rd.nextInt();
		              S.push(data);
		              break;
		      case 2: S.pop();
		              break;
		      case 3: S.display();
		              break;
		      case 4: System.out.println("Stack is empty: " + S.isEmpty());
		              break;
		      case 5: System.out.println("Stack is full: " + S.isFull());
		              break;
		      case 6: System.exit(0);
		      default: System.out.println("select valid operation between 1-6!");
		   }
	   }
	}
}

class Stack{
   int top=-1;
   int size;
   int s[];
   
   Stack(int sz){
      size=sz;
      s = new int[sz];
      
   }
   
   public boolean isFull(){
      if(top==size-1) return true;
      return false;
   }
   
   public boolean isEmpty(){
      if(top!=size-1) return true;
      return false;
   }
   
   public void push(int data){
      if(isFull()) System.out.println("Stack Overflow!");
      else{
         s[++top]=data;
         System.out.println("Element pushed successfully!");
      }
   }
   
   public void pop(){
      if(isEmpty()) System.out.println("Stack Underflow");
      else{
         System.out.println("Element poped is: "+s[top--]);
      }
   }
   
   public void display(){
      if(top==-1)System.out.println("Stack is empty...!");
      else{
         System.out.print("Element is stack: ");
         for(int i=top; i>-1; i--) System.out.print(s[i]+" ");
         System.out.println();
      }
   }
   
}

