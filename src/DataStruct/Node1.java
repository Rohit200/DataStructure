package DataStruct;



public class Node1
{
	public String data1;
	public int data;
	public Node1 nextNode;
	public Node1(int data)
	{
		this.data=data;
	}
	public Node1(String data1)
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
		nextNode=null;
	}

	public void setData(int data)
	{
		this.data=data;
		nextNode=null;
	}
}
