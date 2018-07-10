package DataStruct;
public class Queue1
{
int queue[];
public void sizeOfArray(int n)
{
	queue=new int[n];
}
int front=0;
int rear=0;
public void enqueue(int d)
{
	if(rear<queue.length)
	{
	queue[rear]=d;
	rear++;
	}
}
public int dequeue()
{
  int d=0;
	if(front<queue.length)
	{
	 d=queue[front];
	front++;
	}
	return d;
}
public void display()
{
	for(int i=0;i<queue.length;i++)
	{
	System.out.println(queue[i]);
	}
}
}
