package Data;
import DataStruct.*;
import java.util.Scanner;
public class Prime2D
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	PrimeAnagramCheck pa= new PrimeAnagramCheck();
	System.out.println("Enter the maximum range to find the prime number");
	int l=0;
	int n=sc.nextInt();
	int row=n/100;
	
	int b[]=new int[row];
	int lo=1,hi=100;
	for(int i=0;i<row;i++)
	{
		b[i]=pa.primeCount(lo, hi);
		
		lo=lo+100;
		hi=hi+100;
	}
	int col=pa.big(b);
	System.out.println(col);
	int a[][]=new int[row][col];
	int low=1;
	int high=100;
	for(int j=high;j<n;j++)
	{
		int k=0;
	for(int i=low;i<=high;i++)
	{
	boolean rs=pa.prime(i);
	if(rs)
	{
		a[l][k]=i;
		k++;
	}
	
	}
	l++;
	System.out.println();
	low=low+100;
	high=high+100;
	if(low>=n)
		break;
}
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<25;j++)
		{
			if(a[i][j]!=0)
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}