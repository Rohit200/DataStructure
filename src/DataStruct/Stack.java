package DataStruct;

public class Stack
{
     int stack[];
     public void stackSize(int n)
     {
			stack  =new int[n];
     }
     int top=-1;
     public void push(int d)
     {
    	 if(top<stack.length)
    	 {
    	 top++;
    	 stack[top]=d;
    	 }
     } 
     public int pop()
     {
    	 int d=0;
    	 if(top>-1)
    	 {
    	  d=stack[top];
    	 top--;
    	 }
    	 return d;
     }
     public int peak()
     {
    	 int d=stack[top];
    	 return d;
     }
     public void display()
     {
    	 for(int i=0;i<stack.length;i++)
    	 {
    		 System.out.println(stack[i]);
    	      }
     }
     public int size()
     {
    	 return top;
     }
     public boolean isEmpty()
     {
    	 return top==-1;
     }
}

