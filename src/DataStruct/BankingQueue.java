package DataStruct;
public class BankingQueue
{
int queue[]=new int[10];
int rare=-1;
int front =-1;
int c=0;

public void add()
{
	c++;
	System.out.println("size of queue is "+size());
}
public void exit()
{
	c--;

}
public int size()
{
	return c;
}
public boolean isEmpty()
{
	return c==0;
}
public boolean isFull()
{
	return c==10;
}
}
