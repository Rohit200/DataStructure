package DataStruct;

public class PrimeAnagramCheck
{
  public int reverse(int n)
  {
	  int sum=0;
	  while(n>0)
	  {
	  int r=n%10;
	  sum=sum*10+r;
	  n=n/10;
	  }
	  return sum;
	  }
  
  public boolean prime(int n)
  {
	  int i;
		for( i=2;i<=n/2;i++)
		{
			if(n%i!=0)
				continue;
			else
				break;
			}
		if(n==1||n<=0)
			return false;
		else if(i>n/2||n==2)
			return true;
		else
			return false;
  }
  
  public static int [] bubbleInteger(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
			}
		}
		return a;
	}
  
  public boolean anagram(int a[],int b[])
  {
	  int i;
	  for( i=0;i<a.length;i++)
	  {
		  if(a[i]==b[i])
  	         continue;
  			else
  				break;
  		}
  		if(i>=a.length)
  			return true;
  		else
  			return false;
  	
  }
  
  public int size(int n)
  {
	  int c=0;
	 while(n>0)
	 {
		 c++;
		 n=n/10;
	 }
	 return c;
  }
  
  public int [] store(int n)
  {
	  int m=size(n);
	  int a[]=new int[m];
	  for(int i=a.length-1;i>=0;i--)
	  {
		  int r=n%10;
		  a[i]=r;
		  n=n/10;
	  }
	  return a;
	  
  }
  public int primeCount(int low,int high)
  {
	  int c=0;
	  for(int i=low;i<=high;i++)
	  {
		  boolean rs=prime(i);
		  if(rs)
		  c++;
	  }
	  return c;
  }
  public int big(int a[])
  {
	  int b=a[0];
	  for(int i=1;i<a.length;i++)
	  {
		  if(a[i]>b)
			  b=a[i];
	  }
	  return b;
  }
}
