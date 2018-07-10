package Data;
import  DataStruct.*;
import java.util.*;
public class PrimeAnagramPrint
{
public static void main(String[] args)
{
	DataStruct.LinkedList l1=new DataStruct.LinkedList();
	PrimeAnagramCheck pa = new PrimeAnagramCheck();
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number for the "
					+ "maximum range to find the"
					+ " number is prime as well as Anagram");
	int n=sc.nextInt();
	Queue1 q=new Queue1();
	for (int i=11;i<=n;i++)
	{
		boolean rs=pa.prime(i);
		if(rs)
		{
			int r=pa.reverse(i);
			boolean s1=pa.prime(r);
			if(s1)
			{
			int m=pa.size(i);
			int a[]=new int[m];
			int b[]=new int[m];
			int c[]=new int[m];
			int d[]=new int[m];
			a=pa.store(i);
			b=pa.store(r);
			c=pa.bubbleInteger(a);
			d=pa.bubbleInteger(b);
			boolean rs1=pa.anagram(c, d);
			if(rs1)
			{
				l1.add(i);
			}
			}
		}
	}
	l1.display();
	int m=l1.size();
	System.out.println(m);
	q.sizeOfArray(m);
	for(int i=1;i<=m;i++)
	{
	   int r=l1.get(i);
	   q.enqueue(r);
	}
	q.display();
	}

}
