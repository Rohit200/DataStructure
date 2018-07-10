package DataStruct;
import java.util.Scanner;
public class Palindrome
{
	public boolean palindromeChecker(String s)
	{
		Queue q= new Queue();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length/2;i++)
        {
        	q.enqueue(ch[i]);
        }
        int j;
       for( j=ch.length-1;j>ch.length/2;j--)
       {
    	   if(ch[j]==q.dequeue())
    		   continue;
    	   else
    		   break;
}
       if(j<=ch.length/2)
    	   return true;
       else
    	   return false;
	}
	
}
