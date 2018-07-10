package Data;
import java.util.Scanner;
import  DataStruct.*;
public class PalindromeCheck
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
    String s1=sc.nextLine();
    Palindrome p=new Palindrome();
    boolean rs=p.palindromeChecker(s1);
    if(rs)
    	System.out.println("palindrome");
    	else
    		System.out.println("Not Palindrome");
	}

}
