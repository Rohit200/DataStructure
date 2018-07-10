package DataStruct;

public class Queue 
{
	int n=5;
	int queue[]=new int[n];
	int front=0;
	int rear=0;
	public void enqueue(char d)
	{
		if(rear<n)
		{
		queue[rear]=d;
		rear++;
		}
	}
	public char dequeue()
	{
   char d=' ';
		if(front<n)
		{
		 d= (char)queue[front];
		front++;
		}
		return d;
	}
	public void display()
	{
		for(int i=0;i<n;i++)
		{
		System.out.println(queue[i]);
		}
}
}
