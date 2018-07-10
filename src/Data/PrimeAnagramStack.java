package Data;
import java.util.Scanner;

import DataStruct.*;
public class PrimeAnagramStack
{
public static void main(String[] args)
{
	LinkedList l1=new LinkedList();
	PrimeAnagramCheck pa = new PrimeAnagramCheck();
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number for the "
					+ "maximum range to find the"
					+ " number is prime as well as Anagram");
	int n=sc.nextInt();
	Stack s=new Stack();
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
	//l1.display();
 int m=l1.size();
 System.out.println(m);
 s.stackSize(m);
 for(int i=1;i<=m;i++)
 {
	 int r=l1.get(i);
	 s.push(r);
 }
 for(int i=0;i<m;i++)
 {
	int d=s.pop();
	System.out.println(d);
 }
	}

}
