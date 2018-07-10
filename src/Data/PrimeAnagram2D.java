package Data;
import  DataStruct.*;
import DataStruct.LinkedList;
import DataStruct.Stack;

import java.util.*;
public class PrimeAnagram2D
{
	
public static void main(String[] args)
{
    LinkedList l1=new LinkedList();
    LinkedList l2=new LinkedList();
	PrimeAnagramCheck pa = new PrimeAnagramCheck();
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number for the "
					+ "maximum range to find the"
					+ " number is prime as well as Anagram");
			int n=sc.nextInt();
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
		     l2.add(i);;
		}
	}
}
l2.display();
int m=l1.size();
int row=0,col=0;
for(int i=2;i<100;i++)
{
	if(m%i==0)
	{
		row=i;
		break;
	}
}
col=m/row;
System.out.println(row);
int a[][]=new int[row][col];
int x=1;
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		a[i][j]=l1.get(x);
				x++;
	}
	}
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		System.out.print(a[i][j]+ "\t");
	}
	System.out.println();
}
}
}


