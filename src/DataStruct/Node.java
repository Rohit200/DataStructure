package DataStruct;
public class Node
{
public String data1;
int data;
Node next;
public Node(int data)
{
	this.data=data;
}
public Node(String data1)
{
	this.data1=data1;
}
public int getData()
{
    return this.data;
}
public void setData(String data1)
{
	this.data1=data1;
	next=null;
}

public void setData(int data)
{
	this.data=data;
	next=null;
}
}
